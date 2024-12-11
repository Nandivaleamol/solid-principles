package amolnandiwale.solidprinciples.isp;

// ISP violation example code
public interface PaymentService {
    void initiatePayment(String upiId, double amount);
    void checkBalance(String upiId);
    void generateTransactionReport(String upiId);
}

// ISP violation example code
class BasicUPIPaymentService implements PaymentService {

    @Override
    public void initiatePayment(String upiId, double amount) {
        // Logic to initiate a payment using a basic UPI
    }

    @Override
    public void checkBalance(String upiId) {
        // Logic to check the balance of a basic UPI
    }

    @Override
    public void generateTransactionReport(String upiId) {
        // Not applicable for basic service
        throw new UnsupportedOperationException("Transaction report not supported");
    }
}
