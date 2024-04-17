package March23;

public class AssignmentOp {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("Before Swapping:");
        System.out.println("x is " + x);
        System.out.println("y is " + y);


        System.out.println("");
        System.out.println("After Swapping:");
        /*
        x = x+y; //30
        y = x-y; //10
        x = x-y; //20
        */

        int temp = x; //10
        x = y; //20
        y = temp; //10

        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
}
