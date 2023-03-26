public class main_3 {
    public static void main(String[] args) {
        vehicle my_vehicle = new vehicle("Smokey Nagata", "Top Gear", 132423, 123712937.2132, "blue", 4);
        car my_car = new car("Tofaş", "Murat 131", 123, 1, "bok rengi", 2, 3);
        System.out.println(my_vehicle);
        System.out.println(my_car); 
        my_vehicle.honk();
        my_car.honk(); //overrode a method, an example of polymorphism
    }
}

//access vehicle and car class;