public class Main {
    public static void main(String[] args){

        ChekinAccount myChekinAccount = new ChekinAccount();
        myChekinAccount.SetAccount("Cheking Account"+" ");
       myChekinAccount.SetBalance(67);
       myChekinAccount.SetLimit(1000);
       System.out.println( myChekinAccount.GetAccount() + "balance is:" + myChekinAccount.balance+ "\n"+"Limt is:"+myChekinAccount.GetLimit());

        SavinAccount mySavingAccount = new SavinAccount();
        mySavingAccount.SetAccount("Saving Account"+" ");
        mySavingAccount.SetBalance(90);
        System.out.println(mySavingAccount.account + "balance is:" + mySavingAccount.balance);

        COD MyCOD = new COD();
        MyCOD.SetBalance(905);
        MyCOD.SetAccount("COD Account"+ "");
        System.out.println(MyCOD.account + "Balnce is:" + MyCOD.balance);
        int totalGeneral = myChekinAccount.GetBalance();
             totalGeneral = totalGeneral + MyCOD.GetBalance();
             totalGeneral = totalGeneral + mySavingAccount.GetBalance();
       BankAccount myBankAccount = new BankAccount();


       myBankAccount.SetAccount("Bank Account"+ "");
       System.out.println(myBankAccount.GetAccount() + " Balance is mySavins plus myCheking plus myCOD " );
        System.out.println("total:"+"$"+" "+totalGeneral);
    }
}
