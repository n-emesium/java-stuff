public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
    this.x = x;
    this.y = y;
    }

    public int get_x() {
        return x;
    }
    public int get_y() {
        return y;
    }
    public void set_coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void return_coordinates() {
        System.out.println("x: " +  x + ", y: " + y + " .");
    }
}

class point_3d extends Point {
    private int z;
    public point_3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public int get_z() {
        return z;
    }
    public void set_coordinates(int x, int y, int z) {
        super.set_coordinates(x, y);
        this.z = z;
    }
    public void return_coordinates() {
        System.out.println("x: " + get_x() + ", y: " + get_y() + ", z: " + z + " .");
    }
}

//coordinate setter;;