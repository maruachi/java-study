package _20220414;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void print(){
        System.out.println("age: " + age + " name: " + name);
    }
}
