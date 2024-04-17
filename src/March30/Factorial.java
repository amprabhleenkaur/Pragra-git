package March30;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  number for which you want to find the factorial of: ");
        int number = scanner.nextInt();
        int fact = 1;
        int counter = 1;

        while(counter<=number){

            fact = fact * counter;
            counter++;
        }

        System.out.println("Factorial of " + number + " is " + fact);

    }
}
