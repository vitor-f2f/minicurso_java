import java.util.Scanner;

public class Fibonacci {
    public static int nextNumber(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho da sequencia?");
        int n = scanner.nextInt();
        scanner.nextLine();

        String fibString = "0";
        if (n < 1) {
            System.out.println("Número inválido");
            return;
        } else if (n >= 2) {
            fibString += " 1";
            int a = 0;
            int b = 1;

            for (int i = 2; i < n; i++) {
                fibString += " " + nextNumber(a, b);
                a = a + b;
                b = a - b;
                a = a - b;
                b = nextNumber(a, b);
            }
            
        }
        System.out.println(fibString);
        scanner.close();
    }
}
