package Chapter12.Generics;


import java.util.ArrayList;

class Fruit {
    public String toString(){
        return "Fruit";
    }
}

class Apple extends  Fruit {
    public String toString(){
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString(){
        return "Grape";
    }
}

class Toy {
    public String toString(){
        return "Toy";
    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

    ArrayList<T> getList(){
        return list;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();

//        appleBox.add(new Grape());
//        appleBox.add(new Fruit());
        appleBox.add(new Apple());

        System.out.println(appleBox);

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        System.out.println(fruitBox);
//        지네릭스의 자식 노들은 지네릭스 타입에러를 일으키지 않고 호환 가능하다. 반면 부모 노드는 안 된다.
    }
}
