import java.util.Scanner;
public class capitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. ");
        String s = sc.nextLine();
        String g = "";
        g += s.substring(0,1).toUpperCase();
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(" ")) {
                g += " ";
                g += s.substring(i+1,i+2).toUpperCase();
                i++;
            } else {
                g += s.substring(i,i+1);
            }
        }
        System.out.println(g);
    }
}