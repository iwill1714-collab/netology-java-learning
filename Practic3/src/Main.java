import java.util.Scanner;

import ru.netology.service.CustomsService;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введ товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        System.out.print("Размер пошлины (в руб.) составит: " + CustomsService.calculateCustoms(price, weight));
            }
}