import java.util.Scanner;
import java.util.ArrayList;
//class definition under static context; cannot access method under subclass;
//directly use fperm() method to generate instead of creating an instance;
//works with recursion, try not to force too many stack calls; otherwise the program will not exit();
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> results = new ArrayList<String>();
        System.out.println("Input flushed, enter string value. ");
        String f = sc.nextLine();
        //conv(f) will be sent to the method
        //public method permutation to be called here;
        fperm(results, new ArrayList<Character>(), f);
        printlst(results);
    }
    public static void fperm(ArrayList<String> results ,ArrayList<Character> current, String f) {
        if (f.length() == 0 && !(results.contains(strconv(current)))) {
            results.add(strconv(current));
            return;
        }
        for (int i = 0; i < f.length(); i++) {
            current.add(f.charAt(i));
            String fPrime = f.substring(0,i) + f.substring(i+1);
            fperm(results, current, fPrime);
            current.remove(current.size()-1);
        }
    }
    public static String strconv(ArrayList<Character> carr) {
        String m = "";
        for (int i = 0; i < carr.size(); i++) {
            m += carr.get(i);
        }
        return m;
    }
    /*
    public static boolean compare(ArrayList<Character> carr, String f) {
        for (int i = 0; i < f.length(); i++) {
            if (carr.get(i) != f.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    */
    public static void printlst(ArrayList<String> results) {
        System.out.println();
        for (int i = 0; i < results.size(); i++) {
            System.out.print(results.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }
    //use method to check if all characters are present;
    /*public static boolean allcntn(String f, ArrayList<Character> carr) {
        String con = strconv(carr);
        for (int i = 0; i < con.length(); i++) {
            if (f.indexOf(con.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
    */
    /*
    private static void flush(ArrayList<Character> carr) {
        int i = 0;
        while (i != carr.size()) {
            carr.remove(i);
        }
    }
    */
}