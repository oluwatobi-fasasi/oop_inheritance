package vehicle;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello Vehicle");
        Bike bike = new Bike();
        Truck truck = new Truck();

        System.out.println(bike.color);
        truck.move();
    }
}
