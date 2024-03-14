package ArraysEjemploExamen.main;

import java.util.Scanner;

public class Main {	
	
	public static void main1 () {
		System.out.println ("Hola");
	}
	
	public static void main2 () {
		System.out.println (15 + 18);
		System.out.println ("15" + "18");
		System.out.println ("Hola, " + "mundo!");
	}
	
	public static void main3 () {
		int a;
		String b;
		
		a = 30;
		b = "Trenta";
		
		System.out.println (a + 3);
		System.out.println (b + " y tres");

		a = 14;
		
		System.out.println (a + 1 - 1);
		System.out.println (b + " y tres");
	}
	
	public static void main4 () {

		int a;
		
		a = 30;
		System.out.println (a);
		
		a = a + 1;
		System.out.println (a);
		
		/*
		a = a + 1;
		System.out.println (a);
		
		a = a + 1;
		System.out.println (a);
		*/
		
		a = a + 1;
		System.out.println (a);
		
		a = a + 1;
		System.out.println (a);
	
	}
	
	public static void main5 () {
		System.out.println (3 + 5);
		System.out.println (3 - 5);
		System.out.println (3 * 5);
		System.out.println (3 / 5); /*El resultado da 0 porque se redondea hacia 0 (positivos hacia abajo y negativos hacia arriba)*/
		System.out.println (3 % 5);
		
	}
	
	public static void main6 () {
		System.out.println (2_000_000_000 + 2_000_000_000); /* Se pueden calcular desde -2147483648 hasta 2147483647 */
		
	}

	public static void main7 () {
		float f;
		double d;
		
		f = 123456789101112131415.0F;
		d = 123456789101112131415.0;
		
		System.out.println (f);
		System.out.println (d);

	}
	
	public static void main8 () {
		char c;
		int i;
		
		c = 'A';
		i = c;
		
		System.out.println (c);
		System.out.println (i);
		
	}
	
	public static void main9 () {
		int a = 7;
		int b = 42;
		
		if (a < 5) {
			b = 12;
		}
		
		System.out.println (b);
	}
	
	public static void main10 () {
		int a = 7;
		int b;
		
		if (a < 5) {
			b = 12;
		} else {
			b = 55;
		}
		
		System.out.println (b);
	}
	
	public static void main11 () {
		int a = 10;
		int b;
		
		if (a < 5) {
			b = 12;
		} else {
			if (a < 13) {
				b = 55;
			} else {
				b = -1;
			}
		}
		
		System.out.println (b);
	}
	
	public static void main12 () {
		int a = 1;
		
		switch (a) {
		case 1:
			System.out.println ("Uno");
			break;
		case 2:
			System.out.println ("Dos");
			break;
		case 3:
			System.out.println ("Tres");
			break;	
		case 4:
			System.out.println ("Cuatro");
			break;
		case 5:
			System.out.println ("Cinco");
			break;
		case 6:
			System.out.println ("Seis");
			break;
		default:
			System.out.println ("Rarete no?");
		}
	}
	
	public static void main13 () {
		int a = 4;
		
		if (a == 1) {
			System.out.println ("Uno");
		} else if (a == 2) {
			System.out.println ("Dos");
		} else if (a == 3) {
			System.out.println ("Tres");
		} else if (a == 4) {
			System.out.println ("Cuatro");
		} else if (a == 5) {
			System.out.println ("Cinco");
		} else if (a == 6) {
			System.out.println ("Seis");
		}
	}

	public static void main14 () {
		int edad = 33 ;
		
		if (edad < 0) {
			System.out.println ("No ha nacido");
		} else if (edad < 10) {
			System.out.println ("Niño");
		} else if (edad < 20) {
			System.out.println ("Adolescente");
		} else if (edad < 30) {
			System.out.println ("Adulto");
		} else if (edad < 60) {
			System.out.println ("Anciano");
		}
	}
	
	public static void main15 () {
		int a = 25;
		
		if (a == 25) {
			System.out.println ("callate la boca pelayo");
		} else System.out.println ("callate la boca iyan");
	}
	
	public static void main16 () {
		int c = 0;
		int a1 =22;
		int a2 =12;
		int a3 =2;

		if (a1 > 10) {
			c = c + 1; 
		}
		
		if (a2 > 10) {
			c = c + 1;
		}
		
		if (a3 > 10) {
			c = c + 1;
		}
				
		System.out.println (c);
		
	}
	
	public static void main17 () {
		int c = 0;
		int a1 =70;
		int a2 =40;
		int a3 =30;
		

		if (a1 < a2) {
			c = a1;
		} else {
			c = a2;
		}
		
		if (a3 < c) {
			c = a3;
		}
		
		
		System.out.println (c);
		}
	
	public static void main18 () {
		int i = 1;
		
		while (i < 10) {
			System.out.println (i);
			i = i + 1;
		}
	}
	
	public static void main19 () {
		int k;
		
		for (k = 1; k < 10; k = k + 1) {
			System.out.println (k);
		}
	}
	
	public static void main20_1 () {
		int a1 = 10;
		int a2 = 20;
		int a3 = 15;
		int c;
	
		int mayor = a1;
		int menor = a1;
		
		if (a2 < menor) {
			menor = a2;
		}
		
		if (a2 > mayor) {
			mayor = a2;
		}
		
		if (a3 < menor) {
			menor = a3;
		}
		
		if (a3 > mayor) {
			mayor = a3;
		}
		
		c = a1 + a2 + a3 - mayor - menor;
		
		System.out.println (c);

		}
	
	public static void main20_2 () {
		int a = 5;
		int b = 10;
		int c = 15;
		int x;
	
			if (a <= b) {
				
				//a - b - c
				//a - c - b
				//c - a - b
				
				if ( b <= c) {
					x = b;	//a - b - c
				} else if (a <= c) {
					x = c;	//a - c - b
				} else {
					x = a;	//c - a - b
				}
		
		System.out.println (x);

		}
	
	}
	
	public static void main20_3 () {
		int a = 1;
		int b = 2;
		int c = 3;
		
		if ((a <= c && a >= b) || (a >= c && a <= b)) {
			System.out.println (a);
		} else if ((c >= a && c <= b) || (c <= a && c >= b)) {
			System.out.println(c);
		} else {
			System.out.println(b);
		}
	}
	
	public static void main21 () {
		int k;
		int k2 = 0;
		int z = 4;
		
		for (k = 4; k <= 40; k = k + 4) {
			k2 = k2 + 1; 
			System.out.println (z + " x " + k2 + " = " + k);
		}
	}

	public static void main22 () {
		System.out.println (0xCafe);
	}
		
	public static void main23 () {
		int a = 666;
		System.out.println ((double) a / 2);
	}
	
	public static void main24 () {
		int numVar = 10;
		
		if ( numVar % 2 == 0 ) {
            System.out.println( "El Numero es Par" );
        }
        else {
            System.out.println( "El Numero es Impar" );
		}	
	}

	public static void main25 () {
		Scanner sc = new Scanner (System.in);
		int numVar = sc.nextInt ();
		
		if ( numVar % 2 == 0 ) {
            System.out.println( "El Numero es Par" );
        }
        else {
            System.out.println( "El Numero es Impar" );
		}
		sc.close();
	}

	public static void main26 () {
		Scanner sc = new Scanner (System.in);
		int numVar = sc.nextInt ();
			if (numVar <= 2147483647 && numVar >= 2147483647 ) {
			} else {
				System.out.println ("Esto no es número");
					if ( numVar % 2 == 0 ) {
						System.out.println( "El Numero es Par" );
					} else {
						System.out.println( "El Numero es Impar" );
					}			
			}
			sc.close();
		}

	public static void main27 () {
		Scanner sc = new Scanner (System.in);
		boolean boVar = true;
		
		while (boVar) {
		int a = sc.nextInt ();
		 
			if (a == 0 ) {
				System.out.println ("Has salido del programa porque 0 no es un número válido");
				boVar = false;
			} else if ( a % 2 == 0 ) {
				System.out.println ( "El Numero es Par" );
			} else {
		    	System.out.println( "El Numero es Impar" );
			}				
		}
		sc.close();
	}	
	
	public static void main28 () {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt ();
		int xAnt = x;
			
		while (x >= xAnt) {
				xAnt = x;
			if (x % 2 == 0 ) {
				System.out.println ( "El Numero es Par" );
			} else {
		    	System.out.println( "El Numero es Impar" );
			}
			xAnt = x;
			x = sc.nextInt ();
		}
		sc.close();
	}	
	
	public static void main29 () {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt ();
		int bucleZ = 0;
		
		while (x > 1) {
			
			if ( x % 2 == 0 ) {
				x = x / 2;
				System.out.println (x);
			} else {
				x = x * 3 + 1;
				System.out.println (x);		
			}
				bucleZ++;
		}
			System.out.println ("Has dado " + bucleZ + " vueltas");
			sc.close();
	}
	
	public static void main30 () {
		Scanner sc = new Scanner (System.in);
		int limite = sc.nextInt ();
		int z1 = 1;
		int z2 = 1;
		
		System.out.println (z2);
		System.out.println (z1);
		
		while (z1 <= limite) {
			int x = z2 + z1;
			System.out.println (x);
			
			z2 = z1;
			z1 = x;
		}
		sc.close();			
	}
	
	public static void main31 () {
		Scanner sc = new Scanner (System.in);
			int suma = 4;
			
			System.out.println("Juego De Los Palillos");
			System.out.println("");
			System.out.println("Reglas del juego:");
			System.out.println("Solo puedes coger de 1 a 3 palillos por turno.");
			System.out.println("Al que le quedó 1 pierde.");
			System.out.println("Empecemos->");
			System.out.println("");
			
			System.out.println("Hay 13 palillos") ;
			System.out.println("¿Cuantos coges?") ;
			int userNum = sc.nextInt ();
			int mieleccion = suma - userNum;
			System.out.println("Yo cojo " + mieleccion) ;
			System.out.println("Quedan " + 9 + " palillos") ;
			System.out.println("¿Cuantos cojes?") ;
			
			int userNum2 = sc.nextInt ();
			int mieleccion2 = suma - userNum2;
			System.out.println("Yo cojo " + mieleccion2) ;
			System.out.println("Quedan " + 5 + " palillos") ;
			System.out.println("¿Cuantos cojes?") ;
			
			int userNum3 = sc.nextInt ();
			int mieleccion3 = suma - userNum3;
			System.out.println("Yo cojo " + mieleccion3) ;
			System.out.println("Queda 1 palillo,") ;
			System.out.println("por lo que HAS PERDIDO") ;
			sc.close();
	}

	public static void main32 () {
		Scanner sc = new Scanner (System.in);
		int userNum1 = sc.nextInt ();
		int userNum2 = sc.nextInt ();
		int userNum3 = sc.nextInt ();
		
		System.out.println ("La media de " + userNum1 + ", " + userNum2 + "y " + userNum3 + " es de " + ((userNum1 + userNum2 + userNum3) / 3));
		sc.close();
	}

	
	public static void main33 () {
		Scanner sc = new Scanner (System.in);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese la cantidad de numeros de la que quiere sacar la media");
		int numChose = sc.nextInt();
			
			if (numChose <= 0) {
				System.out.println ("No puedes hacer la media de 0 numeros.");
			}
			
			double suma = 0;
			
			for (int numCan = 1; numCan <= numChose; numCan++) {
			System.out.println ("Ingrese el numero" + numCan + ": ");
			double numero = scanner.nextDouble();
			suma += numero;
		}
			
		double resultado = suma / numChose;
			
		System.out.println ("La media de los numeros introducidos es: " + resultado);
		sc.close();
		scanner.close();
	}
	
	public static void main34 () {
		Scanner sc = new Scanner (System.in);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de numeros de la que quiere sacar la media");
		int numChose = sc.nextInt();
			
			if (numChose <= 0) { //Esta es la cantidad de numeros que introduce el usuario//
				System.out.println ("No puedes hacer la media de 0 numeros.");
			}
			
			double suma = 0; //Esta es la variable en la que se van a almacenar los numeros sumados, sumandose cada uno nuevo al anterior//
			
			for (int numCan = 1; numCan <= numChose; numCan++) { //Esto es un bucle para que cada vez que se secribe un numero, se sume a la variable suma el numero introducido//
			System.out.println ("Ingrese el numero" + numCan + ": ");
			double numero = scanner.nextDouble();
			suma += numero;
		}
			
		double resultado = suma / numChose; //El numero final que queda se divide entre el numero que preseleccionó el usuario al iniciar//
			
		System.out.println ("La media de los numeros introducidos es: " + resultado);
		sc.close();
		scanner.close();		
	}

	public static void main35 () {
		Scanner sc = new Scanner (System.in);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserte numeros para sumar");
		boolean active = true;
		double sumaPar = 0;
		double sumaImpar = 0;
		
			while (active) {	
				double numChose = sc.nextDouble();
					if (numChose != 0) {
						
					if ( numChose % 2 == 0 ) {
						sumaPar += numChose;
					} else if ( numChose % 2 != 0) {
						sumaImpar += numChose; 	
					}
				} else { active = false;		
			}	
		}
		System.out.println ("El resultado de la suma de pares es " + sumaPar);
		System.out.println ("El resultado de la suma de impares es " + sumaImpar);
		sc.close();
		scanner.close();
	}

	public static void main36 () {
		Scanner sc = new Scanner (System.in);
		Scanner scanner = new Scanner(System.in);
		
		double numCal = sc.nextDouble();
		double numMayor = numCal;
		double numMenor = numCal;
		boolean active = true;
		
		while (active) {
			numCal = sc.nextDouble();
			
				if (numCal != 0) {
					if (numCal > numMayor) {
						numMayor = numCal;
					} else if (numCal < numMenor){
						numMenor = numCal;
					}
				} else { active = false;
					
			}	
		}
		System.out.println ("El numero mayor es " + numMayor);
		System.out.println ("El menor es " + numMenor);
		sc.close();
		scanner.close();
	}

	public static void main37 () {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Introduzca las horas actuales:");
		int hora = sc.nextInt();
		System.out.println ("Introduzca los minutos actuales:");
		int minuto = sc.nextInt();
		System.out.println ("Introduzca los segundos actuales:");
		int segundo = sc.nextInt();
		System.out.println ("Introduzca los segundos a sumar:");
		int delta = sc.nextInt();
		
		segundo = segundo + delta;
		minuto += segundo / 60;
		segundo = segundo % 60;
		
		hora += minuto / 60;
		minuto = minuto % 60;
		
		hora = hora % 24;
		
		System.out.println (hora + ":" + minuto + ":" + segundo);
		sc.close();
	}

	public static void main38 () {
		Scanner sc = new Scanner (System.in);
		
		
		int vueltas = 0;
		
		for (int hipopotamos = 0; hipopotamos <= 1000 / 23; hipopotamos++) {
			
			int eurosRestantes = 1000 - 23* hipopotamos;
			
			if (eurosRestantes % 17 == 0) {
				int jirafas = eurosRestantes / 17;
			
				System.out.println (hipopotamos + "H " + jirafas + " J 1000E");
			    }
			    vueltas++;
			} 	
		System.out.println (vueltas + "V");
		sc.close();
	}

	public static void main39 () {
		int vueltas = 0;
		
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
						for (int e = 0; e < 10; e++) {
							for (int f = 0; f < 10; f++) {
								int precio = 215 * a
										+ 275 * b
										+ 335 * c
										+ 355 * d
										+ 420 * e
										+ 580 * f;
								
								if (precio == 1505) {
									System.out.println ("" + a + b + c + d + e + f + " " + precio);
								}
								
								vueltas++;
							}
						}
					}
				}
			}
		}
		System.out.println (vueltas + " Vueltas");
	}

}
