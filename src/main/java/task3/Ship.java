package task3;

public class Ship extends Vehicle {
    private GasEngine engine;

    public Ship(int speed, int fuelCapacity, int enginePower) {
        super(speed, fuelCapacity);
        this.engine = new GasEngine(enginePower);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.DIESEL;
    }

    @Override
    public void displayInfo() {
        System.out.println("Скорость: " + speed + " км/ч," +
                " Запас топлива: " + fuelCapacity + ", Мощность двигателя " + engine.getPower());
    }
}
