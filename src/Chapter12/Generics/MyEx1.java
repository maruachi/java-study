package Chapter12.Generics;

import java.util.ArrayList;

interface BulkMovable{

}

class Vehicle{
    public String toString(){
        return "Vehicle";
    }
}

class Car extends Vehicle{
    public String toString(){
        return "Car";
    }
}

class Train extends Vehicle implements BulkMovable{
    public String toString(){
        return "Car";
    }
}

class VehicleList<T extends Vehicle> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T vehicle){
        list.add(vehicle);
    }

    @Override
    public String toString() {
        return "VehicleList{" +
                "list=" + list +
                '}';
    }
}

class Station{
    static <T extends Vehicle> void printAllVehicle(VehicleList<T> vehicles){
        System.out.println(vehicles);
    }
}

class Car2 extends Vehicle{
    String modelName;

    public Car2(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}

class Tree{
    public String toString(){
        return "Tree";
    }
}

public class MyEx1 {
    public static void main(String[] args) {
        VehicleList<Vehicle> vehicleList = new VehicleList<>();
        VehicleList<Car> carList = new VehicleList<>();
        VehicleList<Car2> car2List = new VehicleList<>();
        VehicleList<Train> trainList = new VehicleList<>();

        vehicleList.add(new Vehicle());
        vehicleList.add(new Car());
        vehicleList.add(new Car2("ionic"));
        vehicleList.add(new Train());

        carList.add(new Car());
        carList.add(new Car());

        Station.printAllVehicle(vehicleList);
        Station.printAllVehicle(carList);
    }
}
