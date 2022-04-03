package TvTest;

public class Tv {
    String color;
    boolean power;
    public int channel;

    public void power() {power = !power;}
    public void channelUp() {++channel;}
    public void channelDown() {--channel;}
}

