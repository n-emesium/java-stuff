import java.util.*;
public class modded_quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean over = false;
        while (!over) {
            System.out.println("For the equation: 'ax^2 + bx + c = 0', enter the value of a. Enter it as a decimal number. ");
            double a = sc.nextDouble();
            sc.nextLine();
            System.out.println("Now enter the value of b. ");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("Now enter the value of c. ");
            int c = sc.nextInt();
            sc.nextLine();
            solution s1 = new solution(a,b,c);
            s1.solve();
            System.out.println();
            System.out.println("Want to continue? ");
            String next_iter = sc.next().toLowerCase();
            sc.nextLine();
            if (next_iter.equals("yes")) {
                System.out.println("Starting progress again. ");
                continue;
            } else {
                System.out.println("Understood, quitting. ");
                over = true;
            }
        }
    }
}

class solution {
    private double a;
    private int b;
    private int c;
    public solution(double a_val, int b_val, int c_val) {
        a = a_val;
        b = b_val;
        c = c_val;
    }
    public void solve() {
        ArrayList<Double> solutions = new ArrayList<Double>();
        double quad_equ_1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double quad_equ_2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        solutions.add(quad_equ_1);
        solutions.add(quad_equ_2);
        System.out.println("The solutions are: ");
        for (double d : solutions) {
            System.out.println(d);
        }
    }
}
