package ArraysEjemploExamen.main;

public class MainFunciones_6 {

	public static double mediaSinExtremos (double a, double b, double c, double d) {
		double valMayor;
		double valMenor;
		double numMedia;
		double numSuma;
		
		if (a >= b && a >= c && a >= d) {
			valMayor = a;
		} else if (b >= a && b >= c && b >= d) {
			valMayor = b;
		} else if (c >= a && c >= b && c >= d) {
			valMayor = c;
		} else {
			valMayor = d;
		}
		
	
		if (a <= b && a <= c && a <= d) {
			valMenor = a;
		} else if (b <= a && b <= c && b <= d) {
			valMenor = b; 
		} else if (c <= a && c <= b && c <= d) {				
			valMenor = c; 
		} else {		
			valMenor = d;		
		}
		
		numSuma = a + b + c + d;
		numMedia =  (numSuma - valMayor - valMenor) / 2;
		
		return numMedia;
	}
	
	public static void main (String [] args) {
		System.out.println (mediaSinExtremos (1, 1, 1, 1));
		System.out.println (mediaSinExtremos (1, 2, 1, 2));
		System.out.println (mediaSinExtremos (1, 2, 1, 1));
		System.out.println (mediaSinExtremos (1, 2, 3, 4.44444));
		System.out.println (mediaSinExtremos (1, 5, 3, 6));
	}
}
