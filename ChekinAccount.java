public class  ChekinAccount extends BankAccount {
    public void SetAccount(String account){
        this.account = account;
    }
    public String GetAccount(){ return  account;}

    public int GetBalance(){ return  balance;}
    public void SetBalance(int balance){
        this.balance = balance;
    }
    int limt;

}
