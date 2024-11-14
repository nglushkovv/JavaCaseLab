package task3;

public class Plane extends Vehicle {
    private GasEngine engine;
    private int maxAltitude;

    public Plane(int speed, int fuelCapacity, int enginePower, int maxAltitude) {
        super(speed, fuelCapacity);
        this.engine = new GasEngine(enginePower);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.DIESEL;
    }

    @Override
    public void displayInfo() {
        System.out.println("Скорость: " + speed + " км/ч," +
                " Запас топлива: " + fuelCapacity + " L, Мощность двигателя " + engine.getPower()
                + " Высота: " + maxAltitude);
    }
}
