package amolnandiwale.solidprinciples.isp;

// ISP implementation example code
public class BasicUPIPaymentServiceImpl implements PaymentInitiationService, BalanceCheckService{
    @Override
    public void initiatePayment(String upiId, Double amount) {
        // Logic to initiate a payment using UPI
    }

    @Override
    public void checkBalance(String upiId) {
        // Logic to check the balance of the UPI account
    }
}
