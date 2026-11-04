import java.util.Scanner;

//Задание №1
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате yyyy:");
        int year = scanner.nextInt();

        int days;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days = 366;
        } else {
            days = 365;
        }
        System.out.println("Количество дней: " + days);
    }
}

//Задание 2
class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        while (true) {

            System.out.println("Введи год: ");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней: ");
            int days = scanner.nextInt();

            if (days == calculator(year)) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + calculator(year) + " дней");
                break;
            }

        }
        System.out.println("Количество набранных очков: " + score);
    }

    public static int calculator(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}    