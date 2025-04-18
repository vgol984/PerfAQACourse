package homework_2;

import java.util.Scanner;

public class Homework_2_2 {
    public static void main(String[] args) {
        //хотел сделать реализацию через свитч или if-else if-else, но решил сделать простым перечислением if
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        }
        if (-5 >= t && t > -20) {
            System.out.println("Normal");
        }
        if (t <= -20) {
            System.out.println("Cold");
        }
        scanner.close();
    }
}
