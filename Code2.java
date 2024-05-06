import java.text.DecimalFormat;

interface Resizable {
    void resize(double factor);
}

class Circle implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= Math.sqrt(factor);
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        double ratio = Math.sqrt(factor);
        width *= ratio;
        height *= ratio;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class Code2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Circle circle = new Circle(5);
        System.out.println("Circle Radius: " + df.format(circle.getRadius()));
        circle.resize(2);
        System.out.println("Resized Circle Radius: " + df.format(circle.getRadius()));

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Width: " + df.format(rectangle.getWidth()) + ", Height: " + df.format(rectangle.getHeight()));
        rectangle.resize(1.5);
        System.out.println("Resized Rectangle Width: " + df.format(rectangle.getWidth()) + ", Height: " + df.format(rectangle.getHeight()));
    }
}
