package April02;

public class Circle {

    public double pi = Math.PI;
    public double calArea(double radius){
        return pi*radius*radius;
    }

    public double calCircumference(double radius){
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.calArea(5);
        System.out.printf("Area of a circle is %.2f", area);

        System.out.println();

        double circumference = circle.calCircumference(7);
        System.out.printf("Circumference of a circle is %.2f", circumference);

    }
}
