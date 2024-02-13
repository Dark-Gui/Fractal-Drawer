import java.awt.Color;

public class Circle {
    private double xPos;    // X-coordinate of the center of the circle
    private double yPos;    // Y-coordinate of the center of the circle
    private double radius;  // Radius of the circle
    private Color color;    // Color of the circle

    // Constructor to initialize a Circle object with given position and radius
    public Circle(double xPos, double yPos, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to set the color of the circle
    public void setColor(Color color) {
        this.color = color;
    }

    // Method to set the position (center) of the circle
    public void setPos(double x, double y) {
        xPos = x;
        yPos = y;
    }

    // Method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get the color of the circle
    public Color getColor() {
        return color;
    }

    // Method to get the X-coordinate of the center of the circle
    public double getXPos() {
        return xPos;
    }

    // Method to get the Y-coordinate of the center of the circle
    public double getYPos() {
        return yPos;
    }

    // Method to get the radius of the circle
    public double getRadius() {
        return radius;
    }
}
