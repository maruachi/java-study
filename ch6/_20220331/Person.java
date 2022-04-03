package _20220331;

public class Person {
    private String s = "donggyu";
    public int x = 7;

    public Person(String name){
        this.s = name;
    }

    public void printName(){
        System.out.println(s);
    }

    public void printAge(){
        System.out.println(this.x);
    }
}
