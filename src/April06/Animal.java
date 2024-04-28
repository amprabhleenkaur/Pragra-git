package April06;

public class Animal {

    public String color;
    public float height;

    Animal(){

        color = "Blue";
        height = 0.5f;

        System.out.println("Animal's color is " + color + ".");
        System.out.println("Animal's height is " + height + "m.");
    }

    public void walk(){
        System.out.println("Animal can walk.");
    }

    public void talk(){
        System.out.println("Animal can bark.");
    }

    public void eat(){
        System.out.println("Animal can eat.");
    }

    public void makeSound(){
        System.out.println("Animal makes a sweet sound.");
    }


}
