package homework_2;

import java.util.Scanner;

public class Homework_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное положительное число:");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a > 0) {
                int sum = 0;
                for (int i = 1; i <= a; i++) {
                    sum += i;
                }
                System.out.print("Сумма чисел от 1 до " + a + " равна " + sum);
            } else {
                System.out.println("Число должно быть больше нуля");
            }

        } else {
            System.out.println("Вы ввели неверное значение");
        }
        scanner.close();
    }
}
