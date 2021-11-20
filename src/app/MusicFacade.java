package app;

public class MusicFacade extends HaveFunHome {

    public MusicFacade (TheaterLights lights, CdPlayer cdPlayer, Amplifier amplifier) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.lights = lights;

    }

    public void startListening () {
        this.lights.on();
        this.amplifier.on();
        this.amplifier.setVolume(5);
        this.amplifier.setCd(this.cdPlayer);
        this.amplifier.setStereoSound();
        this.cdPlayer.on();
        this.cdPlayer.play("Faded");
    }

    public void doneWatching () {
        this.amplifier.off();
        this.amplifier.setCd(this.cdPlayer);
        this.cdPlayer.eject();
        this.cdPlayer.off();
    }
}
