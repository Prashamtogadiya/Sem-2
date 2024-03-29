import java.util.*;

class StudentDemo {
    int id;
    int no_of_Subject;
    String[] subject_code;
    int[] credit;
    String[] grade;
    double spi;

    public StudentDemo(int id, int no_of_Subject) {
        this.id = id;
        this.no_of_Subject = no_of_Subject;
        credit = new int[no_of_Subject];
        grade = new String[no_of_Subject];
        getDetails();

    }

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < no_of_Subject; i++) {
            System.out.println("Enter Subject Credit : ");
            credit[i] = sc.nextInt();
            System.out.println("Enter Subject Grade : ");
            sc.nextLine();
            grade[i] = sc.nextLine();
            System.out.println("Enter Subject Code : ");
            sc.nextLine();
            subject_code[i] = sc.nextLine();
        }
        sc.close();
    }

    public void countSpi() {
        double mark = 0, creditTotal = 0;
        for (int i = 0; i < this.no_of_Subject; i++) {
            String tempgrade = grade[i];
            creditTotal += credit[i];
            if (tempgrade.equals("A++")) {
                mark += (credit[i]*10);
            }
        }
        this.spi = mark / creditTotal;

    }
}

public class ClassStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        StudentDemo []s = new StudentDemo[n];
        for(int i =0 ; i < n ;i++ ){
            System.out.println("Enter Subject for Student : ");
            int x = sc.nextInt();
            s[i] = new StudentDemo(i,x);
        }

sc.close();
    }

}
