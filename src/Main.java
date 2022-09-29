import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("Введите год");
            int year = scanner.nextInt();
            System.out.println("Введите сколько дней");
            int days = scanner.nextInt();
            if (qtyDaysInYear(year) == days) {
                System.out.println("+1 score");
                score++;
            } else if (qtyDaysInYear(year) != 366) {
                System.out.println("Неправильно в этом году 365 дней" + "\n" +
                        "Вы набрали очков: " + score);
                break;
            } else {
                System.out.println("Неправильно в этом году 366 дней" + "\n" +
                        "Вы набрали очков: " + score);
            }

        }
    }

    public static int qtyDaysInYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 || year % 100 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}