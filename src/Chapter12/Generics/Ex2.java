package Chapter12.Generics;

interface Eatable {}

class Fruit2 implements Eatable{
    @Override
    public String toString() {
        return "Fruit2";
    }
}

class Apple2 extends Fruit2{
    @Override
    public String toString() {
        return "Apple2";
    }
}

public class Ex2 {
    public static void main(String[] args) {
//        FruitBox<Apple> appleFruitBox = new FruitBox<Apple>();
//        지네릭스 extend를 이용하여 지네릭스에 들어올 수 있는 타입을 제한 함

        FruitBox<Apple2> appleFruitBox2 = new FruitBox<Apple2>();

    }
}

//interface도 extend를 사용한다
class FruitBox<T extends Fruit2 & Eatable> extends Box<T>{}

class FruitBox2<T extends Fruit2 & Eatable> extends Box<T>{}
