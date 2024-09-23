package composition;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(2.5, 5.0);
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(3.0, "blue", 7.0);
        System.out.println(cylinder3);
    }
}