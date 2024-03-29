public class Command {
    public static void main(String[] args) {
        // int by int always return int.
        // integr parse int
        double n = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double k =n+m;
        System.out.println("Sum is : " + k);
        
    }

}
