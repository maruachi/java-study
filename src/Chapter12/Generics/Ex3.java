package Chapter12.Generics;

class Juice {
    String name;

    public Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer{
    //    파라미터에 지네릭스를 정의되지 않은 상태로 설정해야 하는 상황이다.
//    이때 지네릭스에 사용에 제한을 거는 방법은 와일드 카드를 사용한다.
    static Juice makeJuice(FruitBox3<? extends Fruit> box) {
        String tmp = "";

        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

//? extends myObject 하한 제한 자식들만 가능
//? super myObject 상한 제한 조상들만 가능

class FruitBox3<T extends Fruit> extends Box<T>{

}



public class Ex3 {

}
