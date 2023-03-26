public class family_member {
    private int age;
    public family_member(int age) {
        this.age = age;
    }
    public String drink() {
        return "cup";
    }
    public String eat() {
        return "fork";
    }
}

class Baby extends family_member {
    public Baby(int age) {
        super(age);
    }
    public String eat() {
        return "hands";
    }
}

class spork_user extends family_member {
    public spork_user(int age) {
        super(age);
    }
    public String eat() {
        return "spork";
    }
}

class teenster extends family_member {
    private boolean angsty;
    public teenster(int age, boolean angsty) {
        super(age);
        this.angsty = angsty;
    }
    public String drink() {
        return "your mother";
    }
    public String eat() {
        return "your sanity";
    }
}
