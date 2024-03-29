import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        double area,radius;
        radius = sc.nextDouble();
        sc.close();
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle is :" + area);

    }
    
}
