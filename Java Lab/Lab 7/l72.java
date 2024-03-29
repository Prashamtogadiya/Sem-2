interface A {
   int a = 10;

   public void print_a();
}

interface A1 extends A {
   int b = 20;

   public void print_b();
}

interface A2 extends A {
   int c = 30;

   public void print_c();

}

interface A12 extends A1, A2 {
   int d = 40;

   public void print_d();

}

class B implements A12 {
   public void print_a() {
      System.out.println("a is:" + a);
   }

   public void print_b() {
      System.out.println("a is:" + b);

   }

   public void print_c() {
      System.out.println("a is:" + c);

   }

   public void print_d() {
      System.out.println("a is:" + d);

   }
}

public class l72 {
   public static void main(String[] args) {
      B b1 = new B();
      b1.print_a();
      b1.print_b();
      b1.print_c();
      b1.print_d();

   }
}