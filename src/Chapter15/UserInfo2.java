package Chapter15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperUserInfo {
    String name;
    String password;

    SuperUserInfo(){
        this("Unknown", "1111");
    }

    public SuperUserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class UserInfo2 extends  SuperUserInfo implements Serializable{
    int age;

    public UserInfo2(){
        this("Unknown", "1111", 0);
    }

    public UserInfo2(String name, String password, int age) {
        super(name, password);
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo2{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        //부모 클래스가 Serializable을 상속받지 못했기 때문에 따로 핸들해줘야 함
        out.writeUTF(name);
        out.writeUTF(password);

        //age를 저장
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        name = in.readUTF();
        password = in.readUTF();
        in.defaultReadObject();
    }
}


