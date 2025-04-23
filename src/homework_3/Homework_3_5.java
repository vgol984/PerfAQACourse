package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите количество элементов массива: ");
        int a = scanner.nextInt();
        double[] mass = new double[a];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите значение для элементов массива через Enter");
            mass[i] = scanner.nextInt();
        }
        int lastElement = mass.length - 1;
        for (int i = 0; i < mass.length / 2; i++) {
            double temp = mass[lastElement - i];
            mass[lastElement - i] = mass[i];
            mass[i] = temp;
        }
        System.out.println("Благослови господь комментаторов с жава раш: " + Arrays.toString(mass));
        scanner.close();
    }
}