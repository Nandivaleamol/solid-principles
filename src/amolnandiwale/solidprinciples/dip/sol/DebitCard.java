package amolnandiwale.solidprinciples.dip.sol;

public class DebitCard implements PaymentMethod{
    @Override
    public void makePayment(int amount) {
        System.out.println("Processing debit card payment of " + amount);
    }
}
