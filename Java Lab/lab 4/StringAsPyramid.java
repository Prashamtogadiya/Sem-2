import java.util.*;

public class StringAsPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String str;
        System.out.print("Enter your string : ");
        str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                ch = str.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }

    }

}
