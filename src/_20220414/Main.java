package _20220414;

public class Main {
    public static void main(String[] args){
        Person[] people = new Person[]{
                new Person(17, "seventeen"),
                new Person(23, "twentythree")
        };
        for(int i = 0; i < 2; i++){
            people[i].print();
        }
    }
}
