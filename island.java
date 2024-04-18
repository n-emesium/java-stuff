public class island {
    private int[][] grid;
    private int perimeter;
    public island(int[][] matrix) {
        grid = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                grid[i][j] = matrix[i][j];
            }
        }
        perimeter = getPerimeter();
    }
    public String toString() {
        System.out.println("\n");
        for (int[] arr : grid) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("\nThis is a given island. 1's represent land and 0 represents water. ");
        System.out.println("The perimeter of the given island is: " + perimeter + "\n");
        return "";
    }
    public int getPerimeter() {
        int land = 0, overlap = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) { //this is land;
                    land++;
                    if (i < grid.length - 1 && grid[i+1][j] == 1) {
                        overlap++;
                    }
                    if (j < grid[0].length - 1 && grid[i][j+1] == 1) {
                        overlap++;
                    }
                }
            }
        }
        return land * 4 - overlap * 2;
    }
    public static void main(String[] args) {
        int[][] sample = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        island i1 = new island(sample);
        System.out.println(i1);
    }
}
