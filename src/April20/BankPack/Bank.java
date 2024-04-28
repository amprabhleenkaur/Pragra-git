package April20.BankPack;

public class Bank {

    public String accountInfo;
    public int accountNumber;

    Bank(String accountInfo, int accountNumber){
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
    }

    public void printBankDetails(){

        System.out.println("Account Info: " + accountInfo
        + "\nAccount Number: " + accountNumber);
    }
}
