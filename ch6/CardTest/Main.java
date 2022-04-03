package CardTest;

public class Main {
    public static void main(String[] args){
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.heidgh = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.printf("c1 kind (%s) number (%d) width (%d) height (%d) %n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2 kind (%s) number (%d) width (%d) height (%d) %n", c2.kind, c2.number, c2.width, c2.height);
        System.out.println("c1's width and height is changed into 50 and 80");

        c1.width = 50; c2.height = 80;
        System.out.printf("c1 kind (%s) number (%d) width (%d) height (%d) %n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2 kind (%s) number (%d) width (%d) height (%d) %n", c2.kind, c2.number, c2.width, c2.height);
    }
}
