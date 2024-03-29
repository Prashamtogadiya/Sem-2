public class Object {

    static int objcount=0;

    public  Object(){
        objcount++;
    }

    public static void main(String[] args) {
        // Object obj1 = new Object();
        // Object obj2 = new Object();
        // Object obj3 = new Object();

        System.out.println(objcount);
    }
    
}
