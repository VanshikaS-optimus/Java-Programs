package program_6;

/* @Encapsulation
Write a Java program to create a class called Rectangle with private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables. */

class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

public class Program6 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(6.7);
        rectangle.setWidth(12.0);

        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
