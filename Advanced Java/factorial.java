public class factorial { 
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a-1);
        }
    }
}
