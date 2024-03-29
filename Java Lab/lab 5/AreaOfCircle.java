import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int radius = sc.nextInt();
        sc.close();

        double pi = 3.142, area;
        area = pi * radius * radius;
        System.out.println("Area of circle is :" + area);
    }
}
