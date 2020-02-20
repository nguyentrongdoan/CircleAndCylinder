package Shape;

public class Circle {
    private int radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " +
                getRadius() + "and color = " + getColor()
                + "and Area = " + getArea() + "and Perimeter = " + getPerimeter();
    }

}
