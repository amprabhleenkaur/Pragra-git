package March23;

public class LogicalOp {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 25;
        int num4 = 20;

        System.out.println(num1 > num2 && num1 < num2);
        System.out.println(num1 >= num2 && num1 < num2);
        System.out.println(num1 > num2 && num1 <= num3);
        System.out.println(num1 != num2 && num1 < num4);
        System.out.println(num1 > num2 || num1 < num2);
        System.out.println(num1 > num4 || num1 < num2);
        System.out.println(num1 <= num4 || num1 >= num4);
        System.out.println(num1 > num4 || num2 < num2);
    }


}
