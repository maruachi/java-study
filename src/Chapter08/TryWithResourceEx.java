package Chapter08;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }

        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
    }

    private static class CloseableResource implements AutoCloseable{
        public void exceptionWork(boolean exception) throws WorkException {
            System.out.println("exceptionWork(" + exception + ")가 호출됨");
            if(exception){
                throw new WorkException("WorkException 발생");
            }
        }

        @Override
        public void close() throws CloseException {
            System.out.println("close()가 호출됨");
            throw new CloseException("CloseException 발생");
        }
    }

    private static class WorkException extends Exception {
        WorkException(String msg){
            super(msg);
        }
    }

    private static class CloseException extends Exception {
        CloseException(String message) {
            super(message);
        }
    }
}
