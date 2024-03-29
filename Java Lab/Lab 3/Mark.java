import java.util.*;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total marks of a paper:");
        int outofmarks = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        sc.close();
        double totalmarks;
        totalmarks = m1+m2+m3+m4+m5;
        double per = (totalmarks*100)/(outofmarks*5.0);
       
        System.out.println(per);
        if(totalmarks >=60){
            System.out.println("First division pass with" + totalmarks+"%");
        }
        else if (totalmarks>=50) {
            System.out.println("Second division pass with"+totalmarks+ "%" );
        }
        else if (totalmarks>=40){
            System.out.println("Third division pass with " + totalmarks + "%");
        }
        else{
            System.out.println("You are fail " + totalmarks +"%");
        }



        
    }
    
}
