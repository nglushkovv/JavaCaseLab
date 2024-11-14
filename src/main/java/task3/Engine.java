package task3;

public sealed class Engine permits GasEngine, ElectricEngine {
    protected int power;

    public Engine(int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }
}

final class GasEngine extends Engine {
    public GasEngine(int power){
        super(power);
    }
}

final class ElectricEngine extends Engine {
    public ElectricEngine(int power){
        super(power);
    }
}
