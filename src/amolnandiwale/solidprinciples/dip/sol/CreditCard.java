package amolnandiwale.solidprinciples.dip.sol;

// SOLID Principle: Dependency Inversion Principle (DIP)
public class CreditCard implements PaymentMethod{
    @Override
    public void makePayment(int amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}
