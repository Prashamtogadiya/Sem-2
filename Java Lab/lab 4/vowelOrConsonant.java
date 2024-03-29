import java.util.*;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        sc.close();
        int vc = 0, cc = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
            || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vc++;
            } else {
                cc++;
            }
        }
        System.out.println("No. of vowels in the string are : " + vc);
        System.out.println("No. of consonant in the string are : " + cc);
    }
}