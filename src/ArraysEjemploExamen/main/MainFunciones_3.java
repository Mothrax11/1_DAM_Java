package ArraysEjemploExamen.main;

public class MainFunciones_3 {
		
		public static boolean esPar (int x) {
			return x % 2 == 0;
		}
		
		public static int collatz (int x) {
			
			if (esPar (x)) {
				return x / 2;
			} else {
				return 3 * x + 1;
		}
	}
		public static int pasosCollatz (int x) {
			
			int r = 0;
			
			while (x > 1) {
				x = collatz (x);
				r++;
			}
			return r;
		}
}

