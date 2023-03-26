import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyFunc o1 = new MyFunc();
        System.out.println("Enter input for your object's name. ");
        String user_input = sc.nextLine();
        MyFunc o2 = new MyFunc(user_input);
        System.out.println("Enter input for height values. ");
        double user_input_2 = sc.nextDouble();
        System.out.println("Enter it one more time for the second variable. ");
        double user_input_3 = sc.nextDouble();
        sizes s1 = new sizes(user_input_2,user_input_2);
    }
}

class MyFunc {
    private String trumpet;
    public MyFunc() {
        trumpet = "dongald trumpet";
    }
    public MyFunc(String txt) {
        trumpet = txt; //user_input
        System.out.println("Printing trumpet. ");
    }
}
class sizes {
    private double height;
    private double width;
    public sizes() {
        height = 0.0;
        width = 0.0;
        System.out.println("Null buffer. ");
    }
    public sizes(double x, double y) {
        height = x;
        width = y;
        System.out.println("Complete buffer. ");
    }
    public double get_area_for_hit_buffer() {
        return height * width;
    }
    public String hitbox_area() {
        String txte;
        txte = "Hitbox area: " + get_area_for_hit_buffer();
        return txte;
    }
    //method complete, initialize second constructors 
}

