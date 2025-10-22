package day1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Coco", 9);
        // dog1.bark(37);
        // dog1.eat("Chicken, Eggs and Rice");
        // dog1.sleep(3);


        Owner dogMan = new Owner("Steve", dog1);
        dogMan.walkDog(75);
        


    }
}
