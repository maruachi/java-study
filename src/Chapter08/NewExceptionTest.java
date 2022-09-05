package Chapter08;

public class NewExceptionTest {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFiles();
        }catch (SpaceException e){
            System.out.println("에러메세지 :" + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 바람");
        }catch (MemoryException me){
            System.out.println("에러메세지 :" + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치 시도 바랍니다.");
        }finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {
    }

    private static void copyFiles() {
    }

    private static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 부족합니다");
        }
        if(!enoughMemory()){
            throw new MemoryException("메모리가 부족합니다");
        }
    }

    private static boolean enoughMemory() {
        return true;
    }

    private static boolean enoughSpace() {
        return false;
    }

    private static class SpaceException extends Exception {
        public SpaceException(String message) {
            super(message);
        }
    }

    private static class MemoryException extends Exception {
        public MemoryException(String message) {
            super(message);
        }
    }
}
