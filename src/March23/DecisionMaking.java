package March23;

public class DecisionMaking {

    public static void main(String[] args) {

        int num = 10;
        int evenOdd = 27;
        int leapYear = 2024;

        //Check if number is negative or positive.
        if(num>=0)
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");

        //Check if number is even or odd
        if(evenOdd%2==0)
            System.out.println(evenOdd + " is even");
        else
            System.out.println(evenOdd + " is odd");

        //Check if year is leap year
        if(leapYear%4==0)
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");

    }
}
