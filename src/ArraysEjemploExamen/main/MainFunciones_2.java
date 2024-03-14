package ArraysEjemploExamen.main;

public class MainFunciones_2 {
	
	public static boolean esPar (int x) {
		return x % 2 == 0;
	}
	
	public static void main (String [] args) {
		
		boolean par = esPar(42);
		
		if (par) {
			System.out.println ("SI");
		} else {
			System.out.println ("NO");
		}
	}
}
