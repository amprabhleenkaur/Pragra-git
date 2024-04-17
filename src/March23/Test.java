package March23;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //System.out.println("Beautiful day today!!");
        int x = 10;
        x = x++;
        System.out.println("x is " + x);
        x = ++x;
        System.out.println("x is " + x);

        int y = 10;
        ++y;
        System.out.println("y is " + y);
        System.out.println("x is " + x);
    }
}
