package ArraysEjemploExamen.main;

import java.util.Scanner;

public class MainFunciones_7 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Introduzca primer número");
		int n0 = sc.nextInt();
		System.out.println ("Introduzca segundo número");
		int n1 = sc.nextInt();
		System.out.println ("Introduzca tercer número");
		int n2 = sc.nextInt();
		System.out.println ("Introduzca cuerto número");
		int n3 = sc.nextInt();
		System.out.println ("Introduzca quinto número");
		int n4 = sc.nextInt();
		System.out.println ("Introduzca sexto número");
		int n5 = sc.nextInt();
		System.out.println ("Introduzca séptimo número");
		int n6 = sc.nextInt();
		System.out.println ("Introduzca octavo número");
		int n7 = sc.nextInt();
		System.out.println ("Introduzca noveno número");
		int n8 = sc.nextInt();
		System.out.println ("Introduzca décimo número");
		int n9 = sc.nextInt();
		System.out.println ("Introduzca undécimo número");
		int n10 = sc.nextInt();
		System.out.println ("Introduzca duodécimo número");
		int n11 = sc.nextInt();
		System.out.println ("Introduzca decimotercer número");
		int n12 = sc.nextInt();
		
		boolean numCheck = ean13v1 (n0, n1, n2, n3, n4, n5, n6,n7, n8, n9, n10, n11, n12);
		
		System.out.println (numCheck);
		sc.close();
		
	}
	
public static boolean ean13v1 (int n0, int n1, int n2, int n3, int n4, int n5, int n6,
							   int n7, int n8, int n9, int n10, int n11, int n12) {
	int calculo1;
	int calculo2;
	int calculoTotal;
	
	calculo1 = n0 + n2 + n4 + n6 + n8 + n10 + n12;
	calculo2 = (n1 + n3 + n5 + n7 + n9 + n11) * 3;
	
	calculoTotal = calculo1 + calculo2;
	
	return (calculoTotal % 10 == 0) ? true : false;

}

public static boolean ean13v2 (long ean13) {
	
	long suma = 0;
	
	for (int k = 0; k < 13; k++) {
		suma += (k % 2 != 0 ? 3 : 1) * (ean13 % 10);
		ean13 =  ean13 / 10;
	}
	
	return suma % 10 == 0;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
