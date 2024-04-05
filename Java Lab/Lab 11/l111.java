import java.io.*;

public class l111 {
    public static void main(String[] args) {
        String filename = "abc.txt";
        try {
            BufferedWriter lw = new BufferedWriter(new FileWriter(filename));
            // 向文件中写入数
            Student s1 = new Student("Person1", 18);
            lw.write(s1.toString());
            lw.write("person2,19\n");
            lw.write("person3,20\n");
            lw.write("person4,21\n");
            lw.close();
            System.out.println("Data written Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String[] name_age = line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student stu = new Student(name, age);
                System.out.println(stu);
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "," + age + "\n";
    }

}
