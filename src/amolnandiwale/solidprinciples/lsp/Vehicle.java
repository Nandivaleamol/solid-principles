package amolnandiwale.solidprinciples.lsp;

public abstract class Vehicle {
    public abstract int getCapacity();
}

// Fuel Vehicle
class FuelVehicle extends Vehicle {
    @Override
    public int getCapacity() {
        return 100;
    }
}

// Electric Vehicle
class ElectricVehicle extends Vehicle {
    @Override
    public int getCapacity() {
        return 100; // Battery capacity in kWh
    }
}