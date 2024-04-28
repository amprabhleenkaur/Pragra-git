package April27.Interface3;

public class SmartPhone implements Calculator, Camera, Computer, MusicPlayer{

    @Override
    public void add() {
        System.out.println("Add");
    }

    @Override
    public void subtract() {
        System.out.println("Subtract");
    }

    @Override
    public void multiply() {
        System.out.println("Multiply");
    }

    @Override
    public void divide() {
        System.out.println("Divide");
    }

    @Override
    public void modulus() {
        System.out.println("Modulus");
    }

    @Override
    public boolean takePicture() {
        return true;
    }

    @Override
    public boolean canCalculate() {
        return true;
    }

    @Override
    public boolean canVideoCall() {
        return true;
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void resume() {
        System.out.println("Resume");
    }
}
