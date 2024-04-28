package April20.BankPack;

public class CIBC extends BankOfCanada{

    public double minimumDeposit;
    public double fee;

    CIBC(String accountInfo, int accountNumber,
         double mortgageRate, double minimumDeposit,
         double fee) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fee = fee;
    }

    public void printCIBCInfo(){
        //super.printMortgageRate();
        System.out.println("Minimum Deposit: $" +
                minimumDeposit + "\nFee: $" + fee);
    }
}
