package homework_5.credit_card;

public class CreditCard {
    int accountNumber;
    double currentBalance;
    public CreditCard(int accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }
    public void toTopUp(double sum) {
        currentBalance += sum;
    }
    public void toWithdraw(double sum) {
        currentBalance -= sum;
    }
    public void getCurrentBalance() {
        System.out.println("Текущий баланс для карты " + accountNumber + " равен " + currentBalance);
    }
}
