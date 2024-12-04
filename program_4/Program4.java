package Program_4;
/* 
    @Parameterised Constructor
Write a Java program to create a class called Program4 with instance variables name and color. 
Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
Print the values of the variables.*/

public class Program4 {

    private String name;
    private String color;

    public Program4(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {

        Program4 dog = new Program4("Bailey", "Black");
        System.out.println("Dog's Name: " + dog.name);
        System.out.println("Dog's Color: " + dog.color);
    }
}
