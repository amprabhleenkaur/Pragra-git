/*
You are tasked with developing a Java program that checks a student's grade based on their score.
The grading system is as follows:
A: 90-100 B: 80-89 C: 70-79 D: 60-69 E: 0-59 (Fail)
Write a Java program that takes the student's score as input and determines
and displays the corresponding grade based on the above criteria. Ensure that
the program handles invalid input gracefully and provides appropriate feedback.
*/

package Assignment01;

import java.util.Scanner;

public class Prg03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score to view his grade: ");

        int score = scanner.nextInt();

        if (score<=100 && score>=90)
            System.out.println("A grade!!");
        else if (score<=89 && score>=80)
            System.out.println("B grade!!");
        else if (score<=79 && score>=70)
            System.out.println("C grade!!");
        else if (score<=69 && score>=60)
            System.out.println("D grade!!");
        else if (score<=59 && score>=0)
            System.out.println("Fail!!");
        else
            System.out.println("Score out of bounds!!");

    }
}
