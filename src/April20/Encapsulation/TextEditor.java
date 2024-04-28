package April20.Encapsulation;

//Create a read/write file.
public class TextEditor {

    private String text;
    private String captcha;

    TextEditor(String text, String captcha){
        this.text = text;
        this.captcha = captcha;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public void printDetails(){
        System.out.println("Text is: " + text + "\nCaptcha is: " + captcha);

    }
}
