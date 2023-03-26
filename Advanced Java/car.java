public class car extends vehicle {
    private int tire_num;
    public car() {
        super();
    }
    public car(String model, String brand, int year, double price, String color, int door_num, int tire_num) {
        super(model, brand, year, price, color, door_num);
        this.tire_num = tire_num;
    }
    public void honk() {
        System.out.println("Vroom! Vroom! ");
    }
    public String toString() {
        return getModel() + " " + getBrand() + " " + getYear() + " "  + getPrice() + " " + getColor() + " " + getDoorNum() + " "  + tire_num;
    }
}
//access vehicle and main_3 class;