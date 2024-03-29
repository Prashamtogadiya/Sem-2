import java.util.*;

public class FtoC {

    public void printMe(String a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f,c;
        f = sc.nextDouble();
        sc.close();
        c = (f-32)*5/9 ;
        System.out.println("Fahrenheit to Celsius : " + c);
        FtoC fc = new FtoC();
        fc.printMe("ayush");
    }
    
}
