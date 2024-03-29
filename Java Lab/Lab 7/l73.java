interface transport {
    void deliver();

}

abstract class Animal {

}

class Tiger extends Animal {

}

class Camel extends Animal implements transport {
    public void deliver() {
        System.out.println("Camel is being delivered");
    }
}

class Deer extends Animal {

}

class Donkey extends Animal implements transport {
    public void deliver() {
        System.out.println("Donkey is being Delivered");
    }
}

public class l73 {
    public static void main(String[] args) {
        Animal[] animals = { new Camel(), new Deer(), new Donkey(), new Tiger() };

        for (Animal animal : animals) {
            if (animal instanceof transport) {
                ((transport) animal).deliver();
            }
        }
    }
}
