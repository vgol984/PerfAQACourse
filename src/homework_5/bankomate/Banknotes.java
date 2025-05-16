package homework_5.bankomate;

public class Banknotes {
    int count20;
    int count50;
    int count100;

    public Banknotes(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void AddBanknotes(int add20, int add50, int add100) {
        this.count20 += add20;
        this.count50 += add50;
        this.count100 += add100;
    }

    public void WithdrawBanknotes(int enteredSum) {
        int withdraw20 = 0;
        int withdraw50 = 0;
        int withdraw100 = 0;
        if (((enteredSum) % 20 == 0 | (enteredSum % 50 == 0)) && (count20 * 20 + count50 * 50 + count100 * 100) >= enteredSum) {
            while (enteredSum >= 100 && count100 > 0) {
                enteredSum -= 100;
                count100--;
                withdraw100++;

            }
            while (enteredSum >= 500 && count100 > 0) {
                enteredSum -= 500;
                count50--;
                withdraw50++;
            }
            while (enteredSum >= 20 && count100 > 0) {
                enteredSum -= 20;
                count20--;
                withdraw20++;
            }
        } else {
            System.out.println("Сумма больше, чем есть в банкомате или не кратна 20 и 50. Такие дела.");
        }
        this.count20 -= withdraw20;
        this.count50 -= withdraw50;
        this.count100 -= withdraw100;
        System.out.println("Выдано " + withdraw100 + " соток, " + withdraw50 + " полтинников и " + withdraw20 + " двадцаток");
        //return true;
    }
}
