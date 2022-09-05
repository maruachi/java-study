package Chapter08;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try{
            install();
        }catch (InstallException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void install() throws  InstallException{
        try{
            startInstall();
            copyFiles();
        }catch (SpaceException se){
            InstallException ie = new InstallException("Install exception occurs");
            ie.initCause(se);
            throw ie;
        }catch (MemoryException me){
            InstallException ie = new InstallException("Install exception occurs");
            ie.initCause(me);
            throw ie;
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
            throw new SpaceException("No space to install");
        }
        if(!enoughMemory()){
//            throw new MemoryException("No memory");
            throw new RuntimeException(new MemoryException("No memory"));
        }
    }

    private static boolean enoughMemory() {
        return true;
    }

    private static boolean enoughSpace() {
        return false;
    }

    private static class InstallException extends Exception {
        public InstallException(String message) {
            super(message);
        }
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
