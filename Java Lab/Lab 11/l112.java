import java.io.*;

public class l112 {
    public static void main(String[] args) {
        String filename = args[0];
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found.");
            // return;
        }

        if (file.isFile()) {
            System.out.println("File size : "+file.length());
        }else{
            File []files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }

        }

    }    
}
