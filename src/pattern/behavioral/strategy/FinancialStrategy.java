package pattern.behavioral.strategy;

/**
 * Created by innopolis on 18.01.2017.
 */
public interface FinancialStrategy {
    void pay(int money );
    void setMoney(int money);
    int reject(long transactionID);
}
