package amolnandiwale.solidprinciples.isp;

public interface PaymentInitiationService {
    void initiatePayment(String upiId, Double amount);
}
