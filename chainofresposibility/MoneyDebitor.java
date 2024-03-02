package chainofresposibility;

public abstract class MoneyDebitor {
    protected MoneyDebitor nextMoneyDebitor;

    public MoneyDebitor(MoneyDebitor nextMoneyDebitor){
        this.nextMoneyDebitor = nextMoneyDebitor;
    }

    abstract public boolean debit(int amount);
}
