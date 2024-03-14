package ArraysEjemploExamen.main;

public class MainFunciones_4 {
	
	public static void main (String [] args) {
		System.out.println (esBisiesto (1975));
		System.out.println (diasDelMes (8, 1975));
		System.out.println (esFechaCorrecta (21, 8, 1975));
	}
	
	public static boolean esBisiesto (int ano) {
		return ano % 400 == 0 || (ano % 100 != 0 && ano % 4 == 4);
	}
	
	public static int diasDelMes (int mes, int ano) {
	
		if (mes < 1 || mes > 12) {
			return 0;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		} else if (mes != 2) {
			return 31;
		} else  {
			return esBisiesto (ano) ? 29 : 28;
		}
	}
	
	public static boolean esFechaCorrecta (int dia, int mes, int ano) {
		return dia >= 1 && dia <= diasDelMes (mes, ano);
	}	
}

