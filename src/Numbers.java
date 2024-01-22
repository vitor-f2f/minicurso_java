import java.util.Scanner;

public class Numbers {
    public static String isOdd(int x) {
        if (x % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    public static String isPositive(int x) {
        if (x < 0) {
            return "negativo";
        } else {
            return "positivo";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String parity = isOdd(n);
        String sign = isPositive(n);

        String result = n + " é " + parity + " e " + sign + ".";

        System.out.println(result);
        scanner.close();
    }
}
