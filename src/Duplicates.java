import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] array1 = new String[5];
        String[] array2 = new String[5];

        System.out.println("Digite 5 palavras para o primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            array1[i] = scanner.nextLine();
        }

        System.out.println("Agora digite 5 palavras para o segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            array2[i] = scanner.nextLine();
        }

        Set<String> set1 = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if (set1.contains(array2[i])) {
                duplicates.add(array2[i]);
            }
        }
        
        for (String word : duplicates) {
            System.out.println(word);
        }
        scanner.close();
    }
}
