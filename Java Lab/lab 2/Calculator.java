import java.util.*;

public class Calculator {
    public static void main(String[] args){
        float a,b;
        char oprator;
        System.out.print("Enter Number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("Enter Oprator : ");
        oprator =  sc.next().charAt(0);
        sc.close();
        
        switch (oprator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                // if (b==0) {
                //     System.out.println("Invalid division");
                //     break;
                // }
                
                    System.out.println(a/b);
                    break;
                
            case '%':
                if (b==0) {
                    System.out.println("Invalid modulo");
                    break;
                }
                else{
                    System.out.println(a%b);
                    break;
                }
            default:
                System.out.println("Invalid oprator");
                break;
        }


    }
    
}
