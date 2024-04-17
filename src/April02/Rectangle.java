package April02;

import java.sql.SQLOutput;

public class Rectangle {

    public void calArea(int length, int breadth){
        System.out.println("Area of rectangle is " + (length * breadth));
    }

    public void calPerimeter(int length, int breadth){
        System.out.println("Perimeter of rectangle is " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.calArea(4, 8);
        rectangle.calPerimeter(5, 5);
    }
}
