// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

public class FractalDrawer {
    private double totalArea = 0;  // member variable for tracking the total area

    public FractalDrawer() {}  // constructor

    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(600, 600);
        if (type.equals("Triangle")) {
            drawTriangleFractal(200, 200, 200, 400, Color.BLUE, drawing, 7);
        } else if (type.equals("Circle")) {
            drawCircleFractal(150, 300, 300, Color.CYAN, drawing, 7);
        } else if (type.equals("Rectangle")) {
            drawRectangleFractal(150, 150, 200, 200, Color.DARK_GRAY, drawing, 7);
        }

        return totalArea;
    }

    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Random rand = new Random(); // Create a Random object
        // Generate random values for RGB components to create a random color
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        Triangle tri = new Triangle(x, y, width, height);
        tri.setColor(c);
        can.drawShape(tri);
        double area = tri.calculateArea();
        totalArea += area;
        if (level > 0) {
            // Recursively draw smaller triangles
            drawTriangleFractal(width / 2, height / 2, x - (width / 2), y, randomColor, can, level - 1);
            drawTriangleFractal(width / 2, height / 2, x + (width), y, randomColor, can, level - 1);
            drawTriangleFractal(width / 2, height / 2, x + (width / 4), y - (height), randomColor, can, level - 1);
        }
    }

    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Random rand = new Random(); // Create a Random object
        // Generate random values for RGB components to create a random color
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        Circle cri = new Circle(x, y, radius);
        cri.setColor(c);
        can.drawShape(cri);
        double newRadius = radius / 2;
        double Area = cri.calculateArea();
        totalArea += Area;
        if (level > 0) {
            // Recursively draw smaller circles
            drawCircleFractal(newRadius, x - radius - newRadius / 2, y, randomColor, can, level - 1); // Left
            drawCircleFractal(newRadius, x, y - radius - newRadius / 2, randomColor, can, level - 1); // Top
            drawCircleFractal(newRadius, x + radius + newRadius / 2, y, randomColor, can, level - 1); // Right
            drawCircleFractal(newRadius, x, y + radius + newRadius / 2, randomColor, can, level - 1); // Bottom
        }
    }

    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Random rand = new Random(); // Create a Random object
        // Generate random values for RGB components to create a random color
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        Rectangle rect = new Rectangle(x, y, width, height);
        rect.setColor(c);
        can.drawShape(rect);
        double newWidth = width / 2;
        double newHeight = height / 2;
        double area = rect.calculateArea();
        totalArea += area;
        if (level > 0) {
            // Recursively draw smaller rectangles
            drawRectangleFractal(newWidth, newHeight, x - newWidth / 2, y - newHeight / 2, randomColor, can, level - 1); // Top-left
            drawRectangleFractal(newWidth, newHeight, x + width - newWidth / 2, y - newHeight / 2, randomColor, can, level - 1); // Top-right
            drawRectangleFractal(newWidth, newHeight, x - newWidth / 2, y + height - newHeight / 2, randomColor, can, level - 1); // Bottom-left
            drawRectangleFractal(newWidth, newHeight, x + width - newWidth / 2, y + height - newHeight / 2, randomColor, can, level - 1); // Bottom-right
        }
    }

    // main should ask the user for shape input, and then draw the corresponding fractal.
    // It should print the area of the fractal.
    public static void main(String[] args) {
        FractalDrawer frac = new FractalDrawer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Shape (Triangle, Circle, or Rectangle): ");
        String shape = scanner.nextLine();
        double area = frac.drawFractal(shape);
        System.out.println("Area of the fractal: " + area);
        scanner.close();
    }
}
