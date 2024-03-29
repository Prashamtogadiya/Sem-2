public class l91{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();

        t1.start();
        // t2.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            e.printStackTrace();
            }
            System.out.println("Good Morning");
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Good Afternoon");    
            
        }

    }
}