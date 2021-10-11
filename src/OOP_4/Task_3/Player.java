package OOP_4.Task_3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Playing the audio.");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }

    @Override
    public void pause() {
        System.out.println("Pause...");
    }

    @Override
    public void stop() {
        System.out.println("Stop...");
    }
}
