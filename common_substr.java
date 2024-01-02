import java.util.ArrayList;
public class common_substr {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("abcdef");
        arr.add("abcde");
        arr.add("abcfgh");
        String lcs = substr(arr);
        System.out.println("Largest common substring: " + lcs);
    }
    public static String substr(ArrayList<String> arr) {
        String lcs = "";
        //
        String min_str = arr.get(0);
        for (String m : arr) {
            if (m.length() < min_str.length()) {
                min_str = m;
            }
        }
        int min_length = min_str.length();
        for (int i = 0; i < min_length; i++) {
            for (int j = i + 1; j <= min_length; j++) {
                String current = min_str.substring(i,j);
                boolean includes = true;
                for (String m : arr) {
                    if (!m.contains(current)) {
                        includes = false;
                        break;
                    }
                }
                if (includes && current.length() > lcs.length()) {
                    lcs = current;
                }
            }
        }
        return lcs;
    }
}