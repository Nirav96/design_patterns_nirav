package chainofresposibility;

public class Test {
    public static void main(String[] args) {
        MoneyDebitor moneyDebitor = initaliseMoneyDebitor();
        moneyDebitor.debit(2700);
        moneyDebitor.debit(1300);

        if(!moneyDebitor.debit(80)){
            System.out.println("Invalid Amount");
        }
    }

    private static MoneyDebitor initaliseMoneyDebitor(){
        MoneyDebitor hundredRupeeDebitor = new ConcreteMoneyDebitor(100, 10, null);
        MoneyDebitor fiveHundredRupeeDebitor = new ConcreteMoneyDebitor(500, 10, hundredRupeeDebitor);
        return new ConcreteMoneyDebitor(1000, 10, fiveHundredRupeeDebitor);
    }
}
