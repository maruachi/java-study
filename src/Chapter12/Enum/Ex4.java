package Chapter12.Enum;


//Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T>{
    static int id = 0;
    int ordinal;
    String name = "";

    public MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    public int ordinal() {
        return ordinal;
    }
¡
    public int compareTo(T t){
        return ordinal - t.ordinal();
    }
}

abstract class MyTransportation extends MyEnum{
    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        @Override
        int fare(int distance) {
            return distance*BASIC_FARE;
        }
    };
    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 100) {
        @Override
        int fare(int distance) {
            return distance*BASIC_FARE;
        }
    };

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    private MyTransportation(String name, int basicFare){
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

abstract class MyTransportation2 extends MyEnum{
    static final MyTransportation2 BUS = new MyTransportation2("BUS", 100) {
        @Override
        int fare(int distance) {
            return distance*BASIC_FARE;
        }
    };
    static final MyTransportation2 TRAIN = new MyTransportation2("TRAIN", 100) {
        @Override
        int fare(int distance) {
            return distance*BASIC_FARE;
        }
    };

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    private MyTransportation2(String name, int basicFare){
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        MyTransportation t1 = MyTransportation.BUS;
        MyTransportation t2 = MyTransportation.TRAIN;

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.fare(20));
        System.out.println(t2.fare(30));

        System.out.printf("t1 = %s, %d%n", t1.name, t1.ordinal());
        System.out.printf("t2 = %s, %d%n", t2.name, t2.ordinal());

        MyTransportation2 t3 = MyTransportation2.BUS;
        MyTransportation2 t4 = MyTransportation2.TRAIN;

        System.out.printf("t3 = %s, %d%n", t3.name, t3.ordinal());
        System.out.printf("t4 = %s, %d%n", t4.name, t4.ordinal());
    }
}
