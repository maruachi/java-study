package TvTest;


class Main {
    public static void main(String args[]){
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("The current channel is " + t.channel );
    }
}