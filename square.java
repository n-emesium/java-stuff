import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many objects do you want to create? ");
        int user_input = sc.nextInt();
        for (int i = 0; i < user_input; i++) {
            System.out.println("Enter length of one of the sides. ");
            int side = sc.nextInt();
            square_functions s1 = new square_functions(side);
            System.out.println("The perimeter of your square is: " + s1.return_perimeter());
            System.out.println("The area of your square is: " + s1.return_area());
            for (int j = 0; j < side; j++) {
                for (int k = 0; k < side; k++) { //add input stream;
                    System.out.print("* ");
                }
                System.out.println();
            }
            continue;
        }
    }
}

class square_functions {
    private double side;
    public square_functions() {
        side = 0;
    }
    public square_functions(double val) {
        side = val;
    }
    public void set_side(double x) {
        side = x;
    }
    public double return_perimeter() {
        return (side * 4);
    }
    public double return_area() {
        return side * side;
    }
}