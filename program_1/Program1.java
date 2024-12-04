
/* @Interface 

Create a interface named as Animal consisting of 2 abstract methods
named as sound() and eat().
1]Create a class named as Dog which implements Animal interface.
2]Create a class named as Cow which implements Animal interface.
3]Create an object of class Dog and assign to reference variable of interface Animal.
4]Create an object of class Cow and assign to reference variable of interface Animal.
The Overridden method should print the following output -
For Dog class
		sound()- "Dog barks."
		eat()- "Dog Eats bone."
For Cow class
		sound()-"Cow moo"
		eat() - "Cow eats grass."
*/

interface Animal {
    void eat();

    void sound();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog Eats bone.");
    }

    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cow implements Animal {
    public void eat() {
        System.out.println("Cow eats grass");
    }

    public void sound() {
        System.out.println("Cow moo");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        obj1.eat();
        obj1.sound();

        Animal obj2 = new Cow();
        obj2.eat();
        obj2.sound();
    }
}
