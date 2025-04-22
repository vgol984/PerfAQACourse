package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое положительное число и не используйте других значений, потому что я не хочу писать дополнительные проверки: ");
        int a = scanner.nextInt();
        double[] mass = new double[a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random();
        }
        double max = mass[0];
        double min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Выводим массив для наглядности: ");
        System.out.print(Arrays.toString(mass) + " ");
        System.out.println();
        System.out.println("А тут у нас минимум " + min + " и максимум " + max);
        scanner.close();
    }
}
