import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pw_tries = 0;
        int pw = 688206;
        System.out.println("Enter the password. ");
        int user_in = sc.nextInt();
        if (pw == user_in) {
            System.out.println("Congratulations! You may now access the vault! ");
        } else {
            while (pw != user_in) {
                pw_tries++;
                if (pw_tries == 3) {
                    System.out.println("Too many false attempts. Please wait a while. ");
                    break;
                }
                System.out.println();
                System.out.println("Wrong password, try again. ");
                user_in = sc.nextInt();
                if (pw == user_in) {
                    System.out.println("Congratulations! You may now access the vault! ");
                    break;
                } else {
                    continue;
                }
            }
        }
    }
}
