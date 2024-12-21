public class MainApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Circle circle2 = new Circle(3.2);
        Circle circle3 = new Circle(7.5);
        Cylinder cylinder = new Cylinder(4.0, 10);
        Cylinder cylinder2 = new Cylinder(2.5, 5);
        System.out.println(circle.circumference() + " " + circle.area());
        System.out.println(circle2.circumference() + " " + circle2.area());
        System.out.println(circle3.circumference() + " " + circle3.area());
        System.out.println(cylinder.surfaceArea() + " " + cylinder.volume());
        System.out.println(cylinder2.surfaceArea() + " " + cylinder2.volume());
    }
}
