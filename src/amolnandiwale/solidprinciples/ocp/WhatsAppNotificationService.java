package amolnandiwale.solidprinciples.ocp;

/**
 * Open-Closed Principle violation: The WhatsAppNotificationService class is not open for extension but closed for modification.
 */
public class WhatsAppNotificationService implements NotificationService{

    @Override
    public void sendNotification(String via, String message) {
        // Logic to send a WhatsApp notification
    }

    @Override
    public void setTransactionReport(String via, String report) {
        // Logic to set a transaction report
    }

    @Override
    public void sendOTP(String via, String OTP) {
        // Logic to send an OTP
    }
}
