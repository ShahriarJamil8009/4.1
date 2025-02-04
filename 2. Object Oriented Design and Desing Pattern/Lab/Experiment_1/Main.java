/* 
1. Demonstrate Multiple Interface/Inheritance:  
Write a Java program to demonstrate multiple interface/inheritance.
You are free to choose any application for showcasing multiple interface/inheritance.
*/    


public class Main {
    public static void main(String[] args) {
        Duck obj = new Duck();

        // Calling methods from different interfaces
        obj.eat();
        obj.fly();
        obj.swim();
    }
}
