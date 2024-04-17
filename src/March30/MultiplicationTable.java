package March30;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("For which number you want to display the multiplication table: ");

        int number = scanner.nextInt();
        int counter = 1;
        int prod;

        System.out.println();
        System.out.printf("Multiplication table of %d is as follows", number);
        System.out.println();

        while(counter<=10){

            prod = number*counter;
            System.out.println(number + " X " + counter + " = " + prod);
            counter++;
        }

        System.out.println("--------END--------");
    }
}
