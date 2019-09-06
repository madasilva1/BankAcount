public class Main {
    public static void main(String[] args){

        ChekinAccount myChekinAccount = new ChekinAccount();
        myChekinAccount.SetAccount("marcos");
       myChekinAccount.SetBalance(67);
      System.out.println( myChekinAccount.GetAccount() + "balance is:" + myChekinAccount.balance);

        SavinAccount mySavingAccount = new SavinAccount();
        mySavingAccount.SetAccount("Fulano");
        mySavingAccount.SetBalance(90);
        System.out.println(mySavingAccount.account + "balance is:" + mySavingAccount.balance);

        COD MyCOD = new COD();
        MyCOD.SetBalance(905);
        MyCOD.SetAccount("Beltrano");
        System.out.println(MyCOD.account + "Balnce is:" + MyCOD.balance);

       BankAccount myBankAccount = new BankAccount();
       myBankAccount.SetBalance(675);
       myBankAccount.SetAccount("Zezao");
       System.out.println(myBankAccount.GetAccount() + " Balance is: " + myBankAccount.balance);

    }
}
