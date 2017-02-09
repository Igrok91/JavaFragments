package pattern.behavioral.strategy;

/**
 * Created by innopolis on 18.01.2017.
 */
public class FastStrategy implements FinancialStrategy {
    @Override
    public void pay(int money) {
        System.out.println("I pay fast");
    }

    @Override
    public void setMoney(int money) {
        System.out.println("You set money fast");
    }

    @Override
    public int reject(long transactionID) {
        System.out.println("You reject transaction " + transactionID + " fast");
        return 0;
    }
}
