package ArraysEjemploExamen.main;

public class MainFunciones_5 {

	public static void main (String [] args) {
		System.out.println (jirafasHipopotamos (17, 23, 1000));
		System.out.println (jirafasHipopotamos (1, 2, 1_000_000));
		System.out.println (jirafasHipopotamos (11, 13, 999));
		
	}
	
	
	public static int jirafasHipopotamos (int precioJirafa, int precioHipopotamos, int dineroTotal) {
		
		int nSoluciones = 0;
		int dinero2 = dineroTotal;
		
		for (; 0 <= dinero2; dinero2 -= precioJirafa) {
			if (dinero2 % precioHipopotamos == 0) {
				nSoluciones++;
			}
		}		
		return nSoluciones;
	}
}

