package task3;

public class Car extends Vehicle {
    private GasEngine engine;

    public Car(int speed, int fuelCapacity, int enginePower) {
        super(speed, fuelCapacity);
        this.engine = new GasEngine(enginePower);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GASOLINE;
    }

    @Override
    public void displayInfo() {
        System.out.println("Скорость: " + speed + " км/ч," +
                " Запас топлива: " + fuelCapacity + ", Мощность двигателя " + engine.getPower());
    }
}
