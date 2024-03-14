package ArraysEjemploExamen.simulacroExamen2;

public class ForAnidados {

    public static void main(String[] args) {

        System.out.println(collatz(100));
    }

    public static int collatz(int x) {
            int max = 0;
            int num = 0;
            for (int i = 1; i <= x; i++) {
                int n = i;
                int count = 0;
                
                for (; n != 1; count++) {
                    if (n % 2 == 0) {
                        n /= 2;
                    } else {
                        n = n * 3 + 1;
                    }
                }

                if (count > max) {
                    max = count;
                    num = i;
                }
            }
            return num;
        }
    }