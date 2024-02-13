import java.awt.Color;  // Import the Color class from java.awt package

public class Rectangle {
    private double xPos;    // X-coordinate of the rectangle's position
    private double yPos;    // Y-coordinate of the rectangle's position
    private double width;   // Width of the rectangle
    private double height;  // Height of the rectangle
    private Color color;    // Color of the rectangle

    // Constructor to initialize the rectangle with position and dimensions
    public Rectangle(double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }

    // Calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Calculate and return the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Set the color of the rectangle
    public void setColor(Color color) {
        this.color = color;
    }

    // Set the position of the rectangle
    public void setPos(double x, double y) {
        xPos = x;
        yPos = y;
    }

    // Set the height of the rectangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Get the color of the rectangle
    public Color getColor() {
        return color;
    }

    // Get the X-coordinate of the rectangle's position
    public double getXPos() {
        return xPos;
    }

    // Get the Y-coordinate of the rectangle's position
    public double getYPos() {
        return yPos;
    }

    // Get the height of the rectangle
    public double getHeight() {
        return height;
    }

    // Get the width of the rectangle
    public double getWidth() {
        return width;
    }
}
