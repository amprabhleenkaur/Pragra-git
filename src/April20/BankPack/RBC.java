package April20.BankPack;

public class RBC extends BankOfCanada{

    public double minimumDeposit;
    public double fee;

    RBC(String accountInfo, int accountNumber,
        double mortgageRate, double minimumDeposit,
         double fee) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fee = fee;
    }

    public void printRBCBankInfo(){
        //super.printMortgageRate();
        System.out.println("Minimum Deposit: $" +
                minimumDeposit + "\nFee: $" + fee);
    }
}
