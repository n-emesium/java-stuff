import java.util.ArrayList;
public class pw {
    private static ArrayList<String> arr = new ArrayList<String>();
    private static String alph =  "abcdefghijklmnopqrstuvwxyz";
    private static String alph_up = alph.toUpperCase();
    private static String numbers = "0123456789";
    private static String specil = "!@#$%";
    private static int random(int n) {
        return (int) (Math.random() * n);
    }
    public static void create(int n) {
        String s = "";
        int r1;
        for (int i = 0; i < n; i++) {
            int g = random(4);
            if (g == 0) {
                r1 = random(alph.length());
                s += alph.substring(r1,r1+1);
            } else if (g == 1) {
                r1 = random(alph.length());
                s += alph_up.substring(r1,r1+1);
            } else if(g == 2) {
                r1 = random(numbers.length());
                s += numbers.substring(r1,r1+1);
            } else {
                r1 = random(specil.length());
                s += specil.substring(r1,r1+1);
            }
        }
        arr.add(s);
    }
    public static void print() {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
