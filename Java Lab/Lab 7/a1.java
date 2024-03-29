abstract class vegetable{
    String color;
    // public vegetable(String color){
    //     this.color=color;
    // }
    public abstract void printColor();
    // public abstract String toString();
}

class Tomato extends vegetable{
    public Tomato(String color){
        super.color=color;
        // super(color);
        System.out.println(this.color);
    }

    public void printColor(){
        System.out.println(color);
    }
    // public String toString(){return "tomato";};


}

class Potato extends vegetable{
    public Potato(String color){
        super.color=color;
        System.out.println(color);
    }

    public void printColor(){
    
    }
    // public String toString(){return "Potato";};
}

class Carrot extends vegetable{
    public Carrot(String color){
        super.color=color;
        // super(color);
        System.out.println(this.color);
    }

    public void printColor(){
        // System.out.println(super.color);    
    }
    
    public String toString(){
        return "Carrot";
    }

}



public class a1 {
    public static void main(String[] args) {
        Tomato t1=new Tomato("red");
        Potato p1=new Potato("yellow");
        Carrot c1=new Carrot("orange"); 
        t1.printColor();
        System.out.println(t1);
        System.out.println(p1);
        System.out.println(c1);
    }    
}


