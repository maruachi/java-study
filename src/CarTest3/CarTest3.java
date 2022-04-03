package CarTest3;

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(Car c){
        this(c.color, c.gearType, c.door);
        //color = c.color;
        //gearType = c.gearType;
        //door = c.door;
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest3 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.printf("c1's color (%s) gearType (%s) door (%d)%n", c1.color, c1.gearType, c1.door);
        System.out.printf("c2's color (%s) gearType (%s) door (%d)%n", c2.color, c2.gearType, c2.door);
    }
}
