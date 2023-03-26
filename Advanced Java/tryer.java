import java.util.ArrayList;
public class tryer {
    public static void main(String[] args) {
        family_member mom = new family_member(124);
        Baby jr = new Baby(0);
        spork_user kevin = new spork_user(16);
        teenster clyde = new teenster(153, true);
        ArrayList<family_member> my_fam = new ArrayList<family_member>();
        my_fam.add(mom);
        my_fam.add(kevin);
        my_fam.add(jr);
        my_fam.add(clyde);
        for (family_member l : my_fam) {
            System.out.println(l.drink());
            System.out.println(l.eat());
            System.out.println();
        }
    }
}
