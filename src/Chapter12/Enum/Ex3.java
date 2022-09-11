package Chapter12.Enum;

enum Transportation{
    BUS(100){
        int fare(int distance){
            return distance * BASIC_FARE;
    }},
    TRAIN(150){
        int fare(int distance){
            return distance * BASIC_FARE;
    }},
    SHIP(100){
        int fare(int distance){
            return distance * BASIC_FARE;
    }},
    AIRPLANE(300){
        int fare(int distance){
            return distance * BASIC_FARE;
    }};

    protected final int BASIC_FARE;

    Transportation(int basicFare) {
        this.BASIC_FARE = basicFare;
    }

    abstract int fare(int distance);
}

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("bus fare = " + Transportation.BUS.fare(23));
        System.out.println("bus fare = " + Transportation.TRAIN.fare(10));
    }
}
