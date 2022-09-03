package Chapter15;

import java.io.File;

public class FileEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx2 Directory");
            System.exit(0);
        }

        File f = new File(args[0]);

        if(!f.exists() || !f.isDirectory()){
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }
        File[] files = f.listFiles(); //해당 디렉토리가 가지고 있는 모든 파일 또는 디렉토리들

        for(int i = 0; i < files.length; i++){
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
