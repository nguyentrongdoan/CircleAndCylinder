package Shape;

public class Cylinder extends Circle {
    private int height = 20;

    public Cylinder() {
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getArea(){
        return super.getArea() * 2 + super.getPerimeter() * height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return " A Cylinder with height = " +
                getHeight() + "\nand volume = " + getVolume() + ", which is a subclass of "
                + super.toString();
    }
}
