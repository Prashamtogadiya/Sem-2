import java.util.Scanner;

public class Check {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int vov = 0;
        String b="";
        while(b!= "quit"){
            System.out.print("Enter a new string : ");
            b = sc.nextLine();
            sc.close();
            if(b.equals("quit")){
                break;
            }
            for(int i = 0;i<b.length();i++){
                if(b.charAt(i)=='A'||b.charAt(i)=='E'||b.charAt(i)=='I'||b.charAt(i)=='O'||b.charAt(i)=='U'||b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
                    vov++;
                }
            }
        }
        System.out.println("The totel no. of vovel till now is : "+vov);
}
}