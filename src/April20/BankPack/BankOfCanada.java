package April20.BankPack;

public class BankOfCanada extends Bank{

    public double mortgageRate;

    BankOfCanada(String accountInfo, int accountNumber, double mortgageRate) {
        super(accountInfo, accountNumber);
        this.mortgageRate = mortgageRate;
    }

    public void printMortgageRate(){
        //super.printBankDetails();
        System.out.println("Mortgage Rate: " + mortgageRate + "%");
    }
}
