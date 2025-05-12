package homework_5.bankomate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banknotes banknotes = new Banknotes(0, 0, 0);
        banknotes.AddBanknotes(10, 10, 10);
        System.out.println("Введите сумму выдачи: ");
        int enteredSum = scanner.nextInt();
        banknotes.WithdrawBanknotes(enteredSum);
    }
}
