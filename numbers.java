import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input number to reverse. ");
        int val = sc.nextInt();
        System.out.println("Reverse version is: " + reverse(val));
    }
    public static int reverse(Integer n) {
        String s = n.toString();
        String result = "";
        for (int i = s.length(); i > 0; i--) {
            String elem = s.substring(i-1,i);
            result += elem;
        }
        return Integer.parseInt(result);
    }
}