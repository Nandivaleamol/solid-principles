package amolnandiwale.solidprinciples.ocp;

/**
 * Open/Closed Principle (OCP): EmailNotificationService class is open for extension but closed for modification
 * @author Amol Nandiwale
 */
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String via, String message) {
        // Logic to send an email notification
    }

    @Override
    public void setTransactionReport(String via, String report) {
        // Logic to set a transaction report
    }

    @Override
    public void sendOTP(String via, String OTP) {
        // Logic to send an OTP via email
    }
}
