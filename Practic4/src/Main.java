import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String input1 = scanner.nextLine();
                    int income = Integer.parseInt(input1);
                    earnings += income;
                    break;


                case 2:
                    System.out.println("Введите сумму расходов: ");
                    String input2 = scanner.nextLine();
                    int expense = Integer.parseInt(input2);
                    spendings += expense;
                    break;

                case 3:
                    taxComparison(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }


    public static int taxIncomeExpenses(int earnings) {
        int tax = earnings * 6 / 100;
        return tax;
    }

    public static int taxonIncomeNetofExpenses(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static void  taxComparison(int earnings, int spendings) {
        int tax1 = taxIncomeExpenses(earnings);
        int tax2 = taxonIncomeNetofExpenses(earnings, spendings);

        if (tax1 > tax2) {
            System.out.println("Мы Советуем вам УСН доходы минус расходы\n" +
                    "Ваш налог составит: " + tax2 + "рублей\n" +
                    "Налог на другой системе: " + tax1 + "рублей\n" +
                    "Экономия: " + (tax1 - tax2) + "рублей");

        } else if (tax2 > tax1) {
            System.out.println("Мы Советуем вам УСН доходы\n" +
                    "Ваш налог составит: " + tax1 + "рублей\n" +
                    "Налог на другой системе: " + tax2 + "рублей\n" +
                    "Экономия: " + (tax2 - tax1) + "рублей");
        } else {
            System.out.println("Обе системы налогообложения равны");
        }
    }
}
