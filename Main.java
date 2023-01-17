public class Main {
    public static void main(String[] args) {

    }
}

class Circle {
    private double radius;
    public Circle() {
        radius = 0.0;
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
    public double get_area() {
        return 3.14 * radius * radius;
    }
    public String to_string() {
        String str;
        str = "The circle has radius " + radius + " and area " + get_area();
        return str;
    }
}
