package April06;

public class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    Rectangle(int length){
        this.length = length;
    }

    public int calArea(){
        return length * width;
    }

    public int calPerimeter(){
        return 2*(length+width);
    }
}
