//Q: How many ways can you place a White Knight and a Black Knight on an 8x8 chessboard such that they do not attack each other? Program your answer in Java.

public class knights {
    public static void main(String[] args) {
        System.out.println(count());
    }
    public static int count() {
        int c = 0;
        for (int x1 = 0; x1 < 8; x1++) {
            for (int y1 = 0; y1 < 8; y1++) {
                for (int x2 = 0; x2 < 8; x2++) {
                    for (int y2 = 0; y2 < 8; y2++) {
                        if (check(x1,y1,x2,y2)) {
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }
    public static boolean check(int x1, int y1, int x2, int y2) {
        if (!(x1 == x2 && y1 == y2) && !(Math.abs(x1-x2) * Math.abs(y2-y1) == 2)) {
            return true;
        } else {
            return false;
        }
    }
}
