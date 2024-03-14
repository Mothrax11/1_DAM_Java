package ArraysEjemploExamen.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFunciones_8 {

	public static void main (String [] args) {
		
	}
	
		
	public static int fibonacciV1 (int n) {
		if (n < 2) {
			return 1;
		}
		
		int a = 1;
		int b = 1;
		int c = a + b;
		
		for (int k = 2; k < n; k++) {
			a = b;
			b = c;
			c = a + b;
		}
		
		return c;
	}
}

	
		
		
	