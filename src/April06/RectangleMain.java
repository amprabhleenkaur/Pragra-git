package April06;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Area of rectangle is " + rectangle.calArea());
        System.out.println("Perimeter of rectangle is " + rectangle.calPerimeter());

        System.out.println();
        Rectangle rectangle1 = new Rectangle(3);
        System.out.println("Area of rectangle is " + rectangle1.calArea());
        System.out.println("Perimeter of rectangle is " + rectangle1.calPerimeter());

    }
}
