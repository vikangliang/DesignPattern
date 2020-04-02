package facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        dvdPlayer.off();
        stereo.on();
        projector.off();
        screen.up();
        popcorn.off();
    }
}
