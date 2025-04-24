package homework_3;

import java.util.Scanner;

public class Homework_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое положительное число и не используйте других значений, потому что я не хочу писать дополнительные проверки: ");
        int a = scanner.nextInt();
        int[] mass = new int[a];
        for (int i = 0; i < a; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < a; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        scanner.close();
    }
}
