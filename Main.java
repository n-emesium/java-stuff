public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.4);
        Circle c3 = new Circle(34.21);
        c1.get_perimeter();
        c1.set_radius(12.42);
        c1.get_area();
        c2.all_methods();
    }
}

class Circle {
    private double radius;
    public Circle() {
        radius = 0;
    }
    public Circle(double rad) {
        radius = rad;
    }
    public double get_radius() {
        return radius;
    }
    public void set_radius(double rad) {
        radius = rad;
    }
    public double get_perimeter() {
        return Math.PI * radius * 2;
    }
    public double get_area() {
        return Math.PI * (radius * radius);
    }
    public String all_methods() {
        String str;
        str = "The circle has radius " + radius + "and area " + get_area() + ". It's perimeter is: " + get_perimeter();
        return str;
    }
}
