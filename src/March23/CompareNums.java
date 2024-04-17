package March23;

public class CompareNums {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;

        if(x>y){
            if(x>z)
                System.out.println("X is greatest");
            else
                System.out.println("Z is greatest");
        }
        else if(y>z)
            System.out.println("Y is greatest");
        else
            System.out.println("Z is greatest");

    }
}
