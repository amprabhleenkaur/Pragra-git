package March30;

/*Lottery System
    You ask user to enter a number  1-100   ,    55- Lucky Number
    1. 10 -- Sorry , Try again
    2. 20 --- Sorry Try again
    3. 55 -- You won $50000.
 */

import java.util.Scanner;

public class LotterySystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int luckyNum = 55;
        System.out.println("\nYou have three chances to try your luck!!");

        outer:
        //Loop for chances
        for(int chances = 1; chances <=3; chances++){

            System.out.print("Enter number from 1-100 for " + chances + " chance: ");
            int number = scanner.nextInt();

            //Loop for matching the number
            for(int n = number; n <= 100; n++){

                if(number == luckyNum)
                {
                    System.out.println("\nNumber " + number + " matched with the lucky number " + luckyNum);
                    System.out.println("You win $50000!!!");
                    break outer;
                }
            }

            if(chances>=1 && chances<3)
                System.out.println("Sorry, Try Again!!");
            else
                System.out.println("\nYou ran out of chances. \nProgram Ended!!");

        }
    }
}
