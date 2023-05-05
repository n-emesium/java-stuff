import java.util.Locale;

public class str_methods {
    public static String spongebob_lang(String str) {
        str += " ";
        String result = "";
        int space_index = str.indexOf(" ");
        while (space_index != -1) {
            result += str.substring(0,1).toUpperCase() + str.substring(1,space_index) + ". ";
            str = str.substring(space_index + 1);
            space_index = str.indexOf(" ");
        }
        return result;
    }
    public static String patty_lang(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals(" ")) {
                result += " ";
            } else if (i % 2 == 0) {
                result += str.substring(i,i+1).toLowerCase();
            } else {
                result += str.substring(i,i+1).toUpperCase();
            }
        }
        return result;
    }
    public static String anti_space(String str) {
        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (!str.substring(i,i+1).equals(" ")) {
                result += str.substring(i,i+1);
            }
        }
        return result;
    }
}