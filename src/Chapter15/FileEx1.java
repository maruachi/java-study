package Chapter15;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/dgyim/IdeaProjects/java-study/src/Chapter15/FileEx1.java");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");
        System.out.println(fileName);
        System.out.println(pos);

        System.out.println("경로제외 - " + f.getName());
        System.out.println("확장자제외 - " + fileName.substring(0, pos));
        System.out.println("확장자 - " + fileName.substring(pos+1));

        System.out.println("경로를 포함한 파일이름 - " + f.getPath());
        System.out.println("절대경로 - " + f.getAbsolutePath());
        System.out.println("정규경로 - " + f.getCanonicalPath());
        System.out.println("파일이 속해있는 directory - " + f.getParent());
        System.out.println();
        System.out.println("File.pathSeparator - " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
        System.out.println();
        System.out.println("user.dir =" + System.getProperty("user.dir"));
        System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));
    }
}
