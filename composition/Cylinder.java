package composition;

public class Cylinder {
    private Circle base;
    private double height = 1.0;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius){
        base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius(){
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ",height=" + height + "]";
    }
}
