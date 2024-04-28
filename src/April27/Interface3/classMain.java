package April27.Interface3;

public class classMain {

    public static void main(String[] args) {

        Camera camera = new IPhone();
        System.out.println("Can iPhone take pictures? " + camera.takePicture());

        IPhone iPhone = new IPhone();
        iPhone.adore();
        iPhone.takePicture();
        iPhone.divide();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.pause();
        System.out.println("Can your smartphone calculate? " + smartPhone.canCalculate());
    }
}
