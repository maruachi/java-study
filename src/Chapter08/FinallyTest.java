package Chapter08;

public class FinallyTest {
    public static void main(String[] args) {
//        try{
//            startInstall();
//            copyFiles();
//            deleteTempFiles();
//        }catch (Exception e){
//            e.printStackTrace();
//            deleteTempFiles();
//        }
        try{
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {
    }

    private static void copyFiles() {
    }

    private static void startInstall() {

    }
}
