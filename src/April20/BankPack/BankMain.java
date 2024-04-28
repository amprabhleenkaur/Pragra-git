package April20.BankPack;

public class BankMain {

    public static void main(String[] args) {

        System.out.println("------------RBC------------");
        RBC rbc = new RBC("First Account", 1011, 15, 3000,
                49);
        rbc.printRBCBankInfo();
        rbc.printMortgageRate();
        rbc.printBankDetails();

        System.out.println("\n------------ScotiaBank------------");
        ScotiaBank scotiaBank = new ScotiaBank("Second Account", 1012, 7.5,
                4000,39);
        scotiaBank.printScotiaBankInfo();
        scotiaBank.printMortgageRate();
        scotiaBank.printBankDetails();

        System.out.println("\n------------BMO------------");
        BMO bmo = new BMO("Third Account", 1013, 9.5,
                1000,29);
        bmo.printBMOInfo();
        bmo.printMortgageRate();
        bmo.printBankDetails();

        System.out.println("\n------------TD------------");
        TD td = new TD("Fourth Account", 1014, 19.5,
                10000,299);
        td.printTDInfo();
        td.printMortgageRate();
        td.printBankDetails();

        System.out.println("\n------------CIBC------------");
        CIBC cibc = new CIBC("Fifth Account", 1015, 5,
                9000,29);
        cibc.printCIBCInfo();
        cibc.printMortgageRate();
        cibc.printBankDetails();



    }
}
