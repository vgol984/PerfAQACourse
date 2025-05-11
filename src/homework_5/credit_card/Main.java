package homework_5.credit_card;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(12345, 1023.50);
        CreditCard creditCard2 = new CreditCard(23456, 78955.50);
        CreditCard creditCard3 = new CreditCard(56767, 10266893.50);

        creditCard1.toTopUp(1000);
        creditCard2.toTopUp(2000);
        creditCard3.toWithdraw(10266893);

        System.out.println("Счет карты " + creditCard1.accountNumber + " равен " + creditCard1.currentBalance);
        System.out.println("Счет карты " + creditCard2.accountNumber + " равен " + creditCard2.currentBalance);
        System.out.println("Счет карты " + creditCard3.accountNumber + " равен " + creditCard3.currentBalance);
    }

}
