import java.util.Scanner;
import java.util.ArrayList;
//class definition under static context; cannot access method under subclass;
//directly use fperm() method to generate instead of creating an instance;
//works with recursion, try not to force too many stack calls; otherwise the program will not exit();
public class Main {
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
    public static void fperm(ArrayList<String> results, ArrayList<Character> current, String f) {
        if (!(results.contains(strconv(current))) && f.length() == 0) {
            results.add(strconv(current));
            return;
        }
        for (int i = 0; i < f.length(); i++) {
            current.add(f.charAt(i)); //the character that has been added;
            String fp = f.substring(0,i) + f.substring(i+1); //this character will be discarded;
            fperm(results, current,fp);
            current.remove(current.size() - 1); //backtracked;
        }
    }
    public static String strconv(ArrayList<Character> carr) {
        String m = "";
        for (int i = 0; i < carr.size(); i++) {
            m += carr.get(i);
        }
        return m;
    }
    public static void printlst(ArrayList<String> results) {
        System.out.println();
        int d = 0;
        for (int i = 0; i < results.size(); i++) {
            if (d % 6 == 0) {
                System.out.println();
            }
            System.out.print(results.get(i) + " ");
            d++;
        }
        System.out.println();
    }
}
