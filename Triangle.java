import java.awt.Color;

public class Triangle {
    private double xPos;    // X-coordinate of the triangle's position
    private double yPos;    // Y-coordinate of the triangle's position
    private double width;   // Width of the triangle
    private double height;  // Height of the triangle
    private Color color;    // Color of the triangle

    // Constructor to initialize the triangle with position and dimensions
    public Triangle(double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }

    // Calculate and return the perimeter of the triangle
    public double calculatePerimeter() {
        return 2 * width + Math.sqrt(2) * height;
    }

    // Calculate and return the area of the triangle
    public double calculateArea() {
        return 0.5 * width * height;
    }

    // Set the color of the triangle
    public void setColor(Color color) {
        this.color = color;
    }

    // Set the position of the triangle
    public void setPos(double x, double y) {
        xPos = x;
        yPos = y;
    }

    // Set the height of the triangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Set the width of the triangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Get the color of the triangle
    public Color getColor() {
        return color;
    }

    // Get the X-coordinate of the triangle's position
    public double getXPos() {
        return xPos;
    }

    // Get the Y-coordinate of the triangle's position
    public double getYPos() {
        return yPos;
    }

    // Get the height of the triangle
    public double getHeight() {
        return height;
    }

    // Get the width of the triangle
    public double getWidth() {
        return width;
    }
}
