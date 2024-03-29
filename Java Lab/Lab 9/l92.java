public class l92 {
    public static void main(String[] args) {
        Odd odd = new Odd();
        Even even = new Even();

        odd.start();
        even.start();
    }
}

class Odd extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            e.printStackTrace();
            }
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class Even extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            e.printStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}
