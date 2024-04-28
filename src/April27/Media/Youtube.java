package April27.Media;

public class Youtube implements AudioMediaPlayer, VideoMediaPlayer{

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

    @Override
    public void repeat() {
        System.out.println("Repeat");
    }

    @Override
    public void captions() {
        System.out.println("Captions");
    }

    @Override
    public void chats() {
        System.out.println("Chats");
    }
}
