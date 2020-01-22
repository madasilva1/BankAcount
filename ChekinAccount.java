public class  ChekinAccount extends BankAccount {
    private int limit;
    public void SetAccount(String account){
        this.account = account;
    }
    public String GetAccount(){ return  account;}

    public int GetBalance(){ return  balance;}
    public void SetBalance(int balance){
        this.balance = balance;
    }

    public void SetLimit(int limit){ this.limit = limit;}
    public int GetLimit(){return limit;}


}
