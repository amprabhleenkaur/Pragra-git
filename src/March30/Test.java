package March30;

//Print numbers from 1-10 and sum those.
public class Test {

    public static void main(String[] args) {

        //While loop

        int sum = 0;
        int counter = 1;

        System.out.println("------While Loop------");
        while(counter<=10){
            sum = sum + counter;
            System.out.println(counter);
            counter++;
        }

        System.out.println("Sum is " + sum);

        //do-while loop
        System.out.println();
        System.out.println("------Do-While Loop------");

        sum = 0;
        counter = 1;

        do{
            sum = sum + counter;
            System.out.println(counter);
            counter++;
        }while(counter<=10);

        System.out.println("Sum is " + sum);

    }
}
