package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        MovieFacade movieFacade = new MovieFacade(popper,lights,screen,dvd,projector,amp);
        movieFacade.startWatching();
        movieFacade.doneWatching();

        MusicFacade musicFacade = new MusicFacade(lights,cd,amp);
        musicFacade.startListening();
        musicFacade.doneWatching();

        RadioFacade radioFacade = new RadioFacade(tuner,amp);
        radioFacade.startRadio(120);
        radioFacade.doneWithRadio();
    }
}
