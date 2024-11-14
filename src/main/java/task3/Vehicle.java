package task3;

public abstract class Vehicle implements Transport {
    protected int speed;
    protected int fuelCapacity;

    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public abstract FuelType getFuelType();

    public abstract void displayInfo();

    public void start() {
        System.out.println("Траспорт стартует");
    }

    public void stop() {
        System.out.println("Транспорт останавливается");
    }
}
