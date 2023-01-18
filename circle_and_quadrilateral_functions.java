import java.util.Scanner;
public class circle_and_quadrilateral_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] shapes = {"circle","quadrilateral"};
        String[] quads = {"rectangle", "square"};
        String continue_val;
        boolean quit = false;
        while (!quit) {
        for (String txt : shapes) {
            System.out.println(txt);
        }
        System.out.println("Choose your option. ");
        String user_input = sc.next().toLowerCase();
        System.out.println("Understood, now you will create an object. ");
        if (user_input.equals(shapes[0])) {
            System.out.println("Enter a radius for your circle. ");
            double user_radius = sc.nextDouble();
            circle_functions c1 = new circle_functions(user_radius);
            System.out.println("The perimeter of the circle: " + c1.circ_perimeter());
            System.out.println("The are of the circle: " + c1.circ_area());
            System.out.println("Do you want to create a new object? ");
            continue_val = sc.next();
            if (continue_val.equals("yes")) {
                System.out.println("Understood, will restart the process. ");
                continue;
            } else {
                System.out.println("Quitting. ");
                quit = true;
            }
        } else {
            for (String phrs : quads) {
                System.out.println(phrs);
            }
            System.out.println("Choose a shape. ");
            String quad_val = sc.next();
            if (quad_val.equals(quads[0])) {
                System.out.println("Enter the height of your rectangle. ");
                double height = sc.nextDouble();
                System.out.println("Enter the width of your rectangle. ");
                double width = sc.nextDouble();
                quadrilateral_functions r1 = new quadrilateral_functions(height,width);
                System.out.println("The perimeter of your rectangle: " + r1.quad_perimeter());
                System.out.println("The area of your rectangle: " + r1.quad_area());
                System.out.println("Do you want to continue the process? ");
                continue_val = sc.next();
                if (continue_val.equals("yes")) {
                    System.out.println("Understood, will restart the process. ");
                    continue;
                } else {
                    System.out.println("Quitting. ");
                    quit = true;
                }
            } else {
                System.out.println("Enter one side of your square. ");
                double sqr_val = sc.nextDouble();
                quadrilateral_functions s1 = new quadrilateral_functions(sqr_val);
                System.out.println("The perimeter of your square: " + s1.quad_perimeter());
                System.out.println("The area of your square: " + s1.quad_area());
                System.out.println("Do you wish to continue? ");
                continue_val = sc.next();
                if (continue_val.equals("yes")) {
                    System.out.println("Understood, will restart the process. ");
                    continue;
                } else {
                    System.out.println("Quitting. ");
                    quit = true;
                }
            }
        }
    }
    }
}

class circle_functions {
    private double radius;
    public circle_functions() {
        radius = 0;
        //empty constructor
    }
    public circle_functions(double rad) {
        radius = rad;
        //circle built
    }
    public double circ_perimeter() {
        return radius * 2.0 * Math.PI;
    }
    public double circ_area() {
        return Math.PI * (radius * radius);
    }
}

class quadrilateral_functions {
    private double width;
    private double height;
    public quadrilateral_functions() {
        height = 0;
        width = 0;
        //empty constructor
    }
    public quadrilateral_functions (double hei, double wid) {
        height = hei;
        width = wid;
        //rectangle builder
    }
    public quadrilateral_functions (double hewi) {
        height = hewi;
        width = hewi;
        //square builder
    }
    public double quad_perimeter() {
        return 2 * (width + height);
    }
    public double quad_area() {
        return width * height;
    }
}
