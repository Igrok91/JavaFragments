package pattern.behavioral.strategy;

/**
 * Created by innopolis on 18.01.2017.
 */
public class StandByStrategy implements FinancialStrategy {
    @Override
    public void pay(int money) {
        System.out.println("I pay slow");
    }

    @Override
    public void setMoney(int money) {
        System.out.println("You set money slow");
    }

    @Override
    public int reject(long transactionID) {
        System.out.println("You reject transaction " + transactionID + " slow");
        return 0;
    }
}
