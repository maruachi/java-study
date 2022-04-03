package _20220323;

public class Person {
    private String name = "donggyu";
    private int age = 30;

    public Person(){

    }

    public Person(String name){
        this.name = name;
        System.out.println("Created person");
    }

    public void introPerson(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

//    public void setName(String name){
//        this.name = name;
//    }
}
