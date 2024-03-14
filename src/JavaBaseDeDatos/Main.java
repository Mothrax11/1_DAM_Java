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



public class Main {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //boolean createDB;
        //System.out.print("Nombre de la base de datos a crear: ");
        //final String databaseName = sc.nextLine();

        
        System.out.println("----------0----------");
        System.out.println("1. Añadir");
        System.out.println("2. Borrar");
        System.out.println("3. Cambiar Contraseña");
        System.out.println("4. Iniciar sesión");
        System.out.println("0. Salir");
        int op;
        do{
            op = sc.nextInt();
        } while(op < 0 || op > 4);
        eleccion(op);
    }

    public static void eleccion(int eleccion) {
        final Scanner sc = new Scanner(System.in);
        switch (eleccion) {
            case 1:
                boolean anadir;
                System.out.println("Escriba el nombre de usuario (Max 30 caracteres):");
                String nombreAnadir = sc.next();
                System.out.println("Escriba su contraseña:");
                String contrasenaAnadir = sc.next();
                anadir = GestionUsuarios.anadir(nombreAnadir, contrasenaAnadir);

                if (anadir){
                    System.out.println("El usuario " + nombreAnadir + " ha sido añadido correctamente");
                } else {
                    System.out.println("Error en la creacion de usuario");
                }

                break;

            case 2:
                boolean borrar;
                System.out.println("Escriba el nombre de usuario que desea borrar:");
                String nombreBorrar = sc.next();
                borrar = GestionUsuarios.borrar(nombreBorrar);

                if (borrar) {
                    System.out.println("El usuario " + nombreBorrar + " ha sido eliminado correctamente");
                } else {
                    System.out.println("Error en la eliminacion del usuario");
                }
                
                break;

            case 3:
                boolean cambiarContraseña;
                System.out.println("Escribe el usuario al cual quieres cambiarle la contraseña:");
                String nombreCambiarContrasena = sc.next();
                System.out.println("Escribe la nueva contrasena:");
                String contrasenaCambiarContrasena = sc.next();
                cambiarContraseña = GestionUsuarios.cambiarContrasena(nombreCambiarContrasena, contrasenaCambiarContrasena);

                if (cambiarContraseña) {
                    System.out.println("La contraseña se ha cambiado correctamente");
                } else {
                    System.out.println("Error en el cambio de contraseña");
                }

                break;

            case 4:
                boolean acceder;
                System.out.println("Escriba el nombre del usuario:");
                String nombreAcceder = sc.next();
                System.out.println("Escriba su contraseña:");
                String contrasenaAcceder = sc.next();
                acceder =GestionUsuarios.acceder(nombreAcceder, contrasenaAcceder);

                if (acceder) {
                    System.out.println("El usuario " + nombreAcceder + " ha accedido correctamente");
                } else {
                    System.out.println("Error al iniciar sesion");
                }
                break;

            case 0:
            System.exit(0);
                break; 
        }
    }

    /*
     * public static void createDatabase(final String databaseName) {
     * try {
     * final String url = "jdbc:mariadb://127.0.0.1:3310/";
     * final Connection conn = DriverManager.getConnection(url, "root", "");
     * final PreparedStatement st =
     * conn.prepareStatement("CREATE OR REPLACE DATABASE" + databaseName);
     * st.close();
     * conn.close();
     * } catch (SQLException sqle) {
     * sqle.getMessage();
     * }
     * }
     */
}