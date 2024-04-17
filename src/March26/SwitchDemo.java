package March26;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter either 1 or 2: ");
        int input = scanner.nextInt();

        switch (input){

            case 1:
                System.out.println("1 is entered.");
                break;

            case 2:
                System.out.println("2 is entered.");
                break;

            default:
                System.out.println("Other number is entered!");

        }
    }
}
