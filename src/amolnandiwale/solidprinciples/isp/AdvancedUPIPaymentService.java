package amolnandiwale.solidprinciples.isp;

// ISP example code
public class AdvancedUPIPaymentService implements PaymentInitiationService, BalanceCheckService, TransactionReportService{

    @Override
    public void initiatePayment(String upiId, Double amount) {
        // Logic to initiate UPI payment
    }

    @Override
    public void checkBalance(String upiId) {
        // Logic to check UPI balance
    }

    @Override
    public void generateTransactionReport(String upiId) {
        // Logic to generate transaction report
    }
}
