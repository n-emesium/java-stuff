import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. ");
        String user_in = sc.nextLine();
        String reverse = "";
        for (int i = user_in.length() - 1; i >= 0; i--) {
            reverse += user_in.substring(i,i+1);
        }
        System.out.println(reverse);
    }
}
