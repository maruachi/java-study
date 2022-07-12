package No3;

public class Main {
    public static void main(String[] args){
        Frog frog = Frog.createReverseFrog();
        String solution = frog.speak("I love you");
        System.out.println(solution);
    }
}
