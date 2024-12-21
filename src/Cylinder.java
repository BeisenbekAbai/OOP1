public class Cylinder {
    private double radius;
    private double height;
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double surfaceArea() {
        return Math.PI * radius * radius;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    public String ToString() {
        return "Cylinder radius: " + radius + " and height: " + height;
    }
}
