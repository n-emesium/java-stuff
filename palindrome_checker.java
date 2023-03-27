import java.util.Scanner;
public class palindrome_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input. ");
        String user_in = sc.nextLine().toLowerCase();
        System.out.println(is_palindrome(user_in));
    }
    public static boolean is_palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else if (str.substring(0,1).equals(str.substring(str.length()-1))) {
            return is_palindrome(str.substring(1,str.length()-1));
        } else {
            return false;
        }
    }
}