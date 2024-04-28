package April20.Encapsulation;

//Create a read only file, like pdf
public class PragraWordEditor {

    private String text;
    private String captcha;

    PragraWordEditor(String text, String captcha){
        this.text = text;
        this.captcha = captcha;
    }

    public String getText() {
        return text;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void printDetails(){
        System.out.println("Text is: " + text + "\nCaptcha is: " + captcha);

    }
}
