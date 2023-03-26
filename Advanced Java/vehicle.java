public class vehicle {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int door_num;
    public vehicle() {
        model = null;
        brand = null;
        year = 0;
        price = 0.0;
        color = null;
        door_num = 0;
    }
    public vehicle(String model, String brand, int year, double price, String color, int door_num) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.door_num = door_num;
    }
    public void honk() {
        System.out.println("Düüt! Düüt! ");
    }
    public String toString() {
        return year + " " + brand + " " + model;
    }
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getDoorNum() {
        return door_num;
    }
    
    public void setDoorNum(int door_num) {
        this.door_num = door_num;
    }
}
//access main_3 and car class;