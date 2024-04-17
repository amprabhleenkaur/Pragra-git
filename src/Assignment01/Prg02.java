//Write a program that simulates a traffic light. The user can input a color (red, yellow, or green),
//and the program should output the action based on the traffic light color (stop, prepare to stop, go).

package Assignment01;

import java.util.Scanner;

public class Prg02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter red/yellow/green color to simulate a traffic light: ");

        String color = scanner.next();

        switch (color.toLowerCase()){

            case "red":
                System.out.println("STOP!!!!");
                break;

            case "yellow":
                System.out.println("Prepare to STOP!!!!");
                break;

            case "green":
                System.out.println("GO!!!!");
                break;

            default:
                System.out.println("Wrong color/choice!!!!");
        }
    }
}
