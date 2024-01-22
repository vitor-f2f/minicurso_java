import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        int operation;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nEscolha uma opçao");
            System.out.println("Digite 1 para listar todos os feriados;");
            System.out.println("Digite 2 para verificar se uma data é feriado;");
            System.out.println("Digite 0 para sair.");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                printAllHolidays();
                break;

                case 2:
                System.out.print("Digite uma data (DD-MM-YYYY): ");
                scanner.nextLine();
                String date = scanner.nextLine();
                System.out.println(checkDate(date));
                break;

                case 0:
                break;
                default:
                System.out.println("Operação inválida.");
            }
        } while (operation != 0);
        scanner.close();
    }

    public static void printAllHolidays() {
        System.out.println("Lista de feriados:");
        for (Holiday holiday : holidays) {
            System.out.println(holiday.getDate() + " => " + holiday.getName());
        }
    }
    
    public static String checkDate(String date) {
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                return "Dia " + date + " é " + holiday.getName() + "! :D";
            }
        }
        return "Dia " + date + " nao é feriado :(";
    }
    
    static List<Holiday> holidays = new ArrayList<>();
    static {
        holidays.add(new Holiday("01-01-2024", "Confraternizaçao Mundial"));
        holidays.add(new Holiday("12-02-2024", "Carnaval"));
        holidays.add(new Holiday("13-02-2024", "Carnaval"));
        holidays.add(new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidays.add(new Holiday("21-04-2024", "Tiradentes"));
        holidays.add(new Holiday("01-05-2024", "Dia do Trabalho"));
        holidays.add(new Holiday("30-05-2024", "Corpus Christi"));
        holidays.add(new Holiday("07-09-2024", "Independência do Brasil"));
        holidays.add(new Holiday("12-10-2024", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("02-11-2024", "Finados"));
        holidays.add(new Holiday("15-11-2024", "Proclamação da República"));
        holidays.add(new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        holidays.add(new Holiday("25-12-2024", "Natal"));
    }
}
