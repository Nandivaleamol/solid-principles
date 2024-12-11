package amolnandiwale.solidprinciples.dip.sol;

// Dependency Inversion Principle (DIP) - SOLID Principle
public class Shopping {
    private PaymentMethod paymentMethod;

    public Shopping(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void checkout(int amount){
        paymentMethod.makePayment(amount);
    }
}
