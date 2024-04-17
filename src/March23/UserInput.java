package March23;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Please enter second number: ");
        int y = scanner.nextInt();

        /*int prod = x*y;
        double div = x/y;
*/
        System.out.println("Addition is " + (x+y));
        System.out.println("Difference is " + (x-y));
        System.out.println("Product is " + (x*y));
        System.out.println("Division is " + (x/y));
        System.out.println("Remainder is " + (x%y));

        //To avoid memory leak, we close the scanner.
        scanner.close();
    }
}
