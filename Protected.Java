class Vehicle {

    protected String brand;
    protected String model;
    protected double price;

    public Vehicle (String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
public String getBrand() {
    return brand;
}

public String getMedal() {
    return medal;
}
public double getPrice() {
    return price;
}
class Car extends Vehicle {
    private int numSeats;

    public Car(String brand, String model, double price, int numSeats) {
        super(brand, model, price);
        this.numSeats = numSeats;
    }
}
public int getNumSeats() {
    return numSeats;
}

public void printData() {
    System.out.println("BRAND: " + brand);
    System.out.println("MODEL: " + model);
    System.out.println("PRICE: " + price);
    System.out.println("NUM SEATS: " + numSeats);
    System.out.println("====");
}
class Truck extends Vehicle {

    private double cargoCapacity;

    public Truck(String brand, String model, double price, double cargoCapacity) {
        super(brand, model, price);
        this.cargoCapacity = cargoCapacity;
    }
}
public double getCargoCapacity() {
    return cargoCapacity;
}

public void printData() {
    System.out.println("BRAND: " + brand);
    System.out.println("MODEL: " + model);
    System.out.println("PRICE: " + price);
    System.out.println("CARGO CAPACITY: " + cargoCapacity + " tonnes");
    System.out.println("===================");
}
class Main {
    public static void main(String[] args) {
        Car cl = new Car("TOYOTA", "Land Cruiser", 50000.0, 5);
        Truck tl = new Truck("Volve", "EH16", 220000.0, 38);

        // Calling printData() method for Car object
        cl.printData();

        // Calling printData() method for Truck object
        tl.printData();
    }
}