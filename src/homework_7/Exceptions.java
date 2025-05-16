package homework_7;

import java.util.Arrays;

public class Exceptions {
    public static void main(String[] args) {
        Exceptions test = new Exceptions();
        //Проверка первого метода:
        test.divideByZero(20, 0);
        System.out.println("\n_______________________________________________");
        //Проверка второго метода:
        test.arrayTrobles();
        System.out.println("\n_______________________________________________");
        //Проверка третьего метода:
        test.parseInt("fdg");
        System.out.println("\n_______________________________________________");
        //Проверка четвертого метода:
        test.lastMethod();
        System.out.println("\n_______________________________________________");
    }

    public void divideByZero(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Это же " + e + "\nНе дели на ноль!");
        }
    }

    public void arrayTrobles() {
        try {
            Object[] array = new Integer[1];
            array[7] = "hello";
            System.out.println(Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("У нас в массиве только три местечка есть, ошибочка " + e1);
        } catch (ArrayStoreException e2) {
            System.out.println("Обманываем компилятор со статической типизацией и получаем " + e2);
        }
    }

    public void parseInt(String str) {
        try {
            Integer.parseInt(str);
            System.out.println(str);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Нужно натуральное число, а ты чего пишешь?");
        }
    }

    public void lastMethod() {
        try {
            System.out.println("Ничего не пришло в голову");
        } finally {
            System.out.println("Но, оказывается, при использовании finally можно не использовать catch!");
        }
    }
}