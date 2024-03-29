import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        // Diamond pattern
        /*
        
         *
         **
         ***
         **
         *
         
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
