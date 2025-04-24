package homework_3;

import java.util.Scanner;

public class Homework_3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое положительное число и не используйте других значений, потому что я не хочу писать дополнительные проверки: ");
        int a = scanner.nextInt();
        double[] mass = new double[a];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите значение для элементов массива через Enter");
            mass[i] = scanner.nextInt();
        }
        int countOfNulls = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                countOfNulls++;
            }
        }
        if (countOfNulls > 0) {
            System.out.println("Количество нулей в массиве равно " + countOfNulls);
        } else {
            System.out.println("Нету нулей в массиве");
        }
        scanner.close();
    }
}