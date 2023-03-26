public class baseball_player {
    private String name;
    private int hits;
    private int atBats;
    public baseball_player(String name, int hits, int atBats) {
        this.name = name;
        this.hits = hits;
        this.atBats = atBats;
    }
    public String getName() {
        return name;
    }
    public int getHits() {
        return hits;
    }
    public int getAtBats() {
        return atBats;
    }
    public double getBattingAverage() {
        return (double) hits / atBats;
    }
    public String toString() {
        String str = "" + name + ", " + hits + ", " + atBats;
        return str;
    }
}