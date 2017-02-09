package pattern.behavioral.strategy;

/**
 * Created by innopolis on 18.01.2017.
 */
public class Context {
    private FinancialStrategy strategy;
    private int systemLoad;

    private void calculateStrategy() {
        if(systemLoad>0) {
            if(systemLoad < 100) {
                strategy = new MediumStartegy();
            } else {
                strategy = new FastStrategy();
            }
        } else {
            strategy = new StandByStrategy();
        }
    }

    public void setStrategy(FinancialStrategy strategy) {
        this.strategy = strategy;
    }

    public void excecutePay(int money) {
        strategy.pay(money);
    }
    public void excecuteMoney(int money) {
        strategy.setMoney(money);
    }
    public void excecuteReject(int money) {
        strategy.reject(money);
    }
}
