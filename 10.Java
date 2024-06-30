public class Boat {
    private String colour;
    private int num_machines;
    private double price;

    // Constructor
    public Boat(String colour, int num_machines, double price) {
        this.colour = colour;
        this.num_machines = num_machines;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Colour: " + colour);
        System.out.println("Number of machines: " + num_machines);
        System.out.println("Price: " + price);
    }
}

public class BoatProgram {
    public static void main(String[] args) {
        Boat highSpeed = new Boat("Green", 4, 80000);
        highSpeed.showInfo();
        highSpeed.setPrice(88000);

        // Calculate and print the average price
        double mo = (highSpeed.getPrice()) / 3.0;
        System.out.println("The average price of the boats is: " + mo);
    }
