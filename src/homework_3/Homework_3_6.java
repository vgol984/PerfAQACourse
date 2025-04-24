package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3_6
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите количество элементов массива: ");
        int a = scanner.nextInt();
        double[] mass = new double[a];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите значение для элементов массива через Enter");
            mass[i] = scanner.nextInt();
        }
        boolean increasingSequence = true;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] >= mass[i + 1]){
                increasingSequence = false;
                break;
            }
        }
        if (increasingSequence == true){
            System.out.println("Данная последовательность возрастающая");
        }else{
            System.out.println("Данная последовательность не возрастающая. Может убывающая или я не знаю.");
        }
        scanner.close();
    }
}