package ArraysEjemploExamen.main;

import java.util.Scanner;

public class MainFunciones_1 {
	
	public static void main () {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt ();
		int b = sc.nextInt ();
		int c = sc.nextInt ();
		
		int y = main1 (a, b, c);
		System.out.println (y);
		sc.close();
	}
	
	public static int main1 (int x, int y, int z) {
		
		if (x <= y && x <= z) {
			return x;
		} else if (y <= x && y <= z) {
			return y;
		} else {
			return z;
		}
	}
}
