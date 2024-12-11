package amolnandiwale.solidprinciples.lsp;

// LSP violation example code
public class BadVehicle {
    public int getFuelCapacity() {
        return 50;
    }
}

// LSP violation example code
class ElectricCar extends BadVehicle {
    @Override
    public int getFuelCapacity() {
        throw new UnsupportedOperationException("Electric cars do not have fuel tanks");
    }
}