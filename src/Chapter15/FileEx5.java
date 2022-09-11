package Chapter15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class FileEx5 {
    public static void main(String[] args) {
        if(args.length != 1 || args[0].length() != 1 || "tTlLnN".indexOf(args[0]) == -1){
            System.out.println("USAGE : java fileEx5 SORT_OPTION");
            System.out.println(" SORT_OPTION : ");
            System.out.println(" t Time ascending sort.");
            System.out.println(" T Time descending sort.");
            System.out.println(" l Length ascending sort.");
            System.out.println(" L Length desending sort.");
            System.out.println(" n Name asending sort.");
            System.out.println(" N Name desending sort.");
            System.exit(0);
        }

        final char option = args[0].charAt(0);

        String currDir = System.getProperty("user.dir");
        File dir = new File(currDir + "/Chapter15");
        File[] files = dir.listFiles();

        Comparator<File> comp = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                long time1 = ((File)o1).lastModified();
                long time2 = ((File)o2).lastModified();

                long length1 = ((File)o1).length();
                long length2 = ((File)o2).length();

                String name1 = ((File)o1).getName().toLowerCase();
                String name2 = ((File)o2).getName().toLowerCase();

                int result = 0;
                
                switch (option){ //여기 들여쓰기가 안 됨?? why??
                    case 't':
                        return (int)(time1 - time2);
                    case 'T':
                        return (int)(time2 - time2);
                }
                return 0;
            }

            public boolean equals(Object o){
                return false;
            }
        };

        Arrays.sort(files, comp);

        for(int i = 0; i < files.length; i++){
            File f = files[i];
            String name = f.getName();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String attribute = "";
            String size = "";

            if(files[i].isDirectory()){
                attribute = "DIR";
            }else{
                size = f.length() + "";
                attribute = f.canRead() ? "R" : " ";
                attribute = f.canWrite() ? "W" : " ";
                attribute = f.isHidden() ? "H" : " ";
            }

            System.out.printf("%s %3s %6s %s%n", df.format(new Date(f.lastModified())), attribute, size, name);
        }


    }
}
