package JavaBaseDeDatos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class GestionUsuarios {

    public static char toHex(int x) {
        if (x < 0) {
            return '?';
        } else if (x < 10) {
            return (char) ('0' + x);
        } else if (x < 16) {
            return (char) ('A' + x - 10);
        } else {
            return '?';
        }
    }

    public static String hashToString(byte[] hash) {
        final StringBuilder r = new StringBuilder();

        for (int k = 0; k < hash.length; k++) {
            r.append(toHex((hash[k] >> 4) & 0xF));
            r.append(toHex(hash[k] & 0xF));
        }

        return r.toString();
    }

    public static byte[] sha256(String s) {
        final byte[] b = s.getBytes();

        try {
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            return m.digest(b);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static String salt() {
        StringBuilder r = new StringBuilder();
        for (int k = 0; k < 15; k++) {
            r.append(
                    (char) (33 + (int) (Math.random() * 94)));
        }
        return r.toString();
    }

    public static boolean anadir(String user, String pass){
        String salt = salt();
        String contSalt = salt + pass;

        try {
            //Realiza la conexion con la BD
            final String url = "jdbc:mariadb://127.0.0.1:3310/java_users";
            final Connection con = DriverManager.getConnection(url, "root", "");
            final PreparedStatement st = con.prepareStatement("INSERT INTO USERS (USERNAME, SALT, HASH) VALUES (?, ?, ?)");
            st.setString(1, user);
            st.setString(2, salt);
            st.setBytes(3, sha256(contSalt));

            final ResultSet r = st.executeQuery();
            r.close();
            st.close();
            con.close();
            return true;
        } catch(SQLException e){
            e.getMessage();
            return false;
        }
    }

    public static boolean borrar(String user){
         try {
             // Realiza la conexion con la BD
             final String url = "jdbc:mariadb://127.0.0.1:3310/java_users";
             final Connection con = DriverManager.getConnection(url, "root", "");
             final PreparedStatement st = con.prepareStatement("DELETE FROM USERS WHERE USERNAME = ?");
             st.setString(1, user);
             final ResultSet r = st.executeQuery();
             r.close();
             st.close();
             con.close();
             return true;
         } catch (SQLException e) {
             e.getMessage();
             return false;
         }
    }

    public static boolean cambiarContrasena (String user, String newPass){
        byte [] newHashed = null;
        String newSalt = salt();;
        String newPassSalt = newSalt + newPass;
        newHashed = sha256(newPassSalt);
        try {
            // Realiza la conexion con la BD
            final String url = "jdbc:mariadb://127.0.0.1:3310/java_users";
            final Connection con = DriverManager.getConnection(url, "root", "");
            final PreparedStatement st = con.prepareStatement("UPDATE USERS SET SALT = ?, HASH = ? WHERE USERNAME = ?;");
            st.setString(1, newSalt);
            st.setBytes(2, newHashed);
            st.setString(3, user);
            final ResultSet r = st.executeQuery();
        
            r.close();
            st.close();
            con.close();
            return true;
        }catch(
        SQLException e)
        {
            e.getMessage();
            return false;
        }
    }

    public static boolean acceder (String user, String pass){
        
        String userSalt = "";
        byte [] compareUserPassSalt = null;
        byte [] userPassHash = null;

        try {
            // Realiza la conexion con la BD
            final String url = "jdbc:mariadb://127.0.0.1:3310/java_users";
            final Connection con = DriverManager.getConnection(url, "root", "");
            final PreparedStatement st = con.prepareStatement("Select salt, hash from users where username = ?");
            st.setString(1, user);
            final ResultSet r = st.executeQuery();
            r.next();
            userSalt = r.getString(1);
            userPassHash = r.getBytes(2);
            compareUserPassSalt = sha256(userSalt + pass);

            r.close();
            st.close();
            con.close();

            return MessageDigest.isEqual(userPassHash, compareUserPassSalt);

        } catch (SQLException e) {
        
        }
        return false;
    }
}
