package NeedForSpeed;

public class Vehicle {

    protected final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    protected double fuelConsumption;
    protected double fuel;
    protected int horsePower;





    public void drive(double kilometers) {
        double requiredFuel = kilometers * fuelConsumption;

        if (this.fuel >= requiredFuel) {
            this.fuel -= requiredFuel;
        }
    }




    public Vehicle(double fuel, int horsePower) {
        setFuel(fuel);
        setHorsePower(horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
