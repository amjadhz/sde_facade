package app;

public class MovieFacade extends HaveFunHome {

    public MovieFacade (PopcornPopper popcorn, TheaterLights lights, Screen screen, DvdPlayer dvdPlayer, Projector projector, Amplifier amplifier) {
        this.amplifier = amplifier;
        this.popcorn = popcorn ;
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.projector = projector;
    }

    public void startWatching () {
        this.popcorn.on();
        this.popcorn.pop();
        this.lights.dim(5);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amplifier.on();
        this.amplifier.setDvd(this.dvdPlayer);
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(5);
        this.dvdPlayer.on();
        this.dvdPlayer.play("Presentation");
    }

    public void doneWatching () {
        this.popcorn.off();
        this.lights.off();
        this.screen.up();
        this.projector.off();
        this.amplifier.off();
        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }
}
