package April27.Media;

public class MediaMain {

    public static void main(String[] args) {

        AudioMediaPlayer amp = new Youtube();
        amp.repeat();

        VideoMediaPlayer vmp = new Youtube();
        vmp.chats();

        MediaPlayer mp = new YoutubePremium();
        mp.resume();

        YoutubePremium ytp = new YoutubePremium();
        ytp.playOffScreen();
    }
}
