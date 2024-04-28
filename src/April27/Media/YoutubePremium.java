package April27.Media;

public class YoutubePremium extends Youtube implements AudioMediaPlayer, VideoMediaPlayer{

    public void subscribers(){
        System.out.println("Subscribers");
    }

    public void playOffScreen(){
        System.out.println("Can Play OffScreen");
    }
}
