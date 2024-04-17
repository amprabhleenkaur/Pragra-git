//Create a program that takes a character as input and determines if it's a vowel or a consonant.

package Assignment01;

import java.util.Scanner;

public class Prg01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char input = scanner.next().charAt(0);
        char lowerCaseInput = Character.toLowerCase(input);

        if (lowerCaseInput == 'a' || lowerCaseInput == 'e' || lowerCaseInput == 'i' ||
                lowerCaseInput == 'o' || lowerCaseInput == 'u')
            System.out.println("Character is a vowel.");
        else
            System.out.println("Character is a consonant");
    }
}
