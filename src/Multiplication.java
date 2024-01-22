import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número a ser multiplicado?");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tabela de multiplicaçao por " + n);
        
        for (int i = 1; i <= 10; i++) {
            int res = i * n;
            System.out.println(n + " x " + i + " = " + res);
        }
        scanner.close();
    }
}
