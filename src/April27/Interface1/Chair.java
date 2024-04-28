package April27.Interface1;

public class Chair implements Furniture{

    @Override
    public void area() {
        System.out.println("Area");
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter");
    }

    @Override
    public void material() {
        System.out.println("Material");
    }
}
