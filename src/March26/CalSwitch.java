package March26;

import java.util.Scanner;

public class CalSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char choiceIs = 'Y';

        do {

            System.out.print("\nDo you want to continue? \nEnter 'Y' for YES or 'N' for NO: ");
            char charChoice = scanner.next().charAt(0);
            choiceIs = Character.toUpperCase(charChoice);

            if(choiceIs == 'Y'){
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter Second number: ");
                int num2 = scanner.nextInt();

                int result = 0;

                System.out.println();
                System.out.println("Here are the choices for the calculator:");
                System.out.println("Press 1 for addition.");
                System.out.println("Press 2 for subtraction.");
                System.out.println("Press 3 for multiplication.");
                System.out.println("Press 4 for division.");
                System.out.println("Press 5 for remainder.");
                System.out.println();

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();

                System.out.println();

                switch (choice) {

                    case 1:
                        result = num1 + num2;
                        System.out.printf("Addition of %d and %d is %d", num1, num2, result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.printf("Subtraction of %d and %d is %d", num1, num2, result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.printf("Multiplication of %d and %d is %d", num1, num2, result);
                        break;

                    case 4:
                        double div = num1 / num2;
                        System.out.printf("Division of %d and %d is %.2f", num1, num2, div);
                        break;

                    case 5:
                        result = num1 % num2;
                        System.out.printf("Remainder of %d and %d is %d", num1, num2, result);
                        break;

                    default:
                        System.out.println("Wrong choice, Bye!");
                }

            }

            else
                break;

        }while(choiceIs == 'Y');

        System.out.println("Program Ended!");

    }
}
