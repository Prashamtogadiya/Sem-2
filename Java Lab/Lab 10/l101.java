import java.util.*;
import java.io.*;

public class l101 {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try {
            file.createNewFile();
            if (!file.exists()) {
                System.out.println("File not exist");
            }

            FileReader f1 = new FileReader("abc.txt");
            BufferedReader b1 = new BufferedReader(f1);

            int charcount=0;
            int linecount=0;
            int wordcount=0;
            String line = b1.readLine();
            while (line != null) {
                linecount++;
                charcount += line.length();
                String [] word = line.trim().split(" ");
                wordcount += word.length;
                line = b1.readLine();
            }

            b1.close();
            System.out.println("Characters: " + charcount + "\nLines: " + linecount + "\nWords: " + wordcount);

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
