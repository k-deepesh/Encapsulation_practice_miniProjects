

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle();

        // Set the radius using the setter method
        circle.setRadius(7.0);

        // Get the radius using the getter method
        double radius = circle.getRadius();

        // Calculate and print the area and perimeter
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
