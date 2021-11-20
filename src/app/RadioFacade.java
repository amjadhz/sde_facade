package app;

public class RadioFacade extends HaveFunHome {

    public RadioFacade (Tuner tuner, Amplifier amplifier) {
        this.tuner = tuner;
        this.amplifier = amplifier;
    }

    public void startRadio (double frequency) {
        this.tuner.on();
        this.tuner.setFrequency(frequency);
        this.amplifier.on();
        this.amplifier.setVolume(5);
        this.amplifier.setTuner(this.tuner);
    }

    public void doneWithRadio () {
        this.tuner.off();
        this.amplifier.off();
    }
}
