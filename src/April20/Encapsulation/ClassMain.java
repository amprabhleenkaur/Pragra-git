package April20.Encapsulation;

public class ClassMain {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor("I love Java", "jfyj7");
        textEditor.setText("I do not love Java");
        textEditor.printDetails();

        PragraWordEditor pragraWordEditor = new PragraWordEditor("How are you doing?", "hgj7");
        String text = pragraWordEditor.getText();
        System.out.println("\nText is " + text);
    }
}
