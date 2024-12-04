package Program_5;

/* @Override

Write a Java program to create a class called Animal with a method named move(). 
Create a subclass called Cheetah that overrides the move() method to run.
*/

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal {
    public void move() {
        System.out.println("Cheetah is running");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Animal obj = new Cheetah();
        obj.move();
    }
}
