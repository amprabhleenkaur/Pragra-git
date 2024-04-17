package March30;

//Print numbers from 1-n and calculate the sum up to n.

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number until which you want to print the loop: ");
        int number = scanner.nextInt();
        int sum = 0;
        int counter = 1;

        //while loop
        System.out.println();
        System.out.println("------While Loop------");
        while(counter<=number){
            System.out.println(counter);
            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum is " + sum);

        //do-while loop
        sum = 0;
        counter = 1;

        System.out.println();
        System.out.println("------Do-While Loop------");

        do{
            System.out.println(counter);
            sum = sum + counter;
            counter++;
        }while(counter<=number);

        System.out.println("Sum is " + sum);
    }


}
