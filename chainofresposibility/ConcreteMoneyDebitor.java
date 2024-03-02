package chainofresposibility;

public class ConcreteMoneyDebitor extends MoneyDebitor{

    private int noteAmount = 0;
    private int notes = 0;

    public ConcreteMoneyDebitor(int noteAmount, int notes, MoneyDebitor nextMoneyDebitor){
        super(nextMoneyDebitor);
        this.noteAmount = noteAmount;
        this.notes = notes;
    }

    @Override
    public boolean debit(int amount) {
        if(notes * noteAmount >= amount){
            int noteReq = amount / noteAmount;
            int remAmount = amount - (noteReq * noteAmount);

            if (remAmount == 0 || (remAmount > 0 && nextMoneyDebitor != null && nextMoneyDebitor.debit(remAmount))){
                this.notes -= noteReq;
                if(noteReq > 0) System.out.println(noteReq + " notes of " + this.noteAmount + " has been debited");
                return true;
            }
        }

        return false;
    }
}
