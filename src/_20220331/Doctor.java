package _20220331;

public class Doctor extends Person {
    public int x = 10;

    public Doctor(){
        super("dongs");
        System.out.println("hello world");
    }

    public void printAge1(){
        System.out.println(this.x);
    }

    public void printAge2(){
        System.out.println(super.x);
    }

    @Override
    public void printAge(){
        System.out.println(this.x);
    }
}
