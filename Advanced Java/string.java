public class string {
    private String txt;
    public string() {
        txt = "";
    }
    public string(String txt) {
        this.txt = txt;
    }
    public void palindrome_check() {
        String space = "";
        for (int i = 0; i < txt.length(); i++) {
            if (txt.substring(i,i+1).equals(" ")) {
                continue;
            } else {
                space += txt.substring(i,i+1);
            }
        }
        String reverse = "";
        for (int i = space.length()-1; i >= 0; i--) {
            reverse += space.substring(i,i+1);
        }
        if (reverse.equals(space.toLowerCase())) {
            System.out.println("Palindrome. ");
        } else {
            System.out.println("Not palindrome. ");
        }
    }
}
//javadoc tags added @string//multiclass