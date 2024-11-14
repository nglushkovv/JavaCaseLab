package task3;

public class Bicycle extends Vehicle {

    public Bicycle(int speed) {
        super(speed, 0);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.NONE;
    }

    @Override
    public void displayInfo() {
        System.out.println("Скорость:  " + speed + " км/ч");
    }

    @Override
    public void start() {
        System.out.println("Велосипед стартует");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остнавливается");
    }
}
