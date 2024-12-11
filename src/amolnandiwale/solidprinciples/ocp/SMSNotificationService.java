package amolnandiwale.solidprinciples.ocp;

// Open-Closed Principle violation: The SMSNotificationService class is not open for extension
public class SMSNotificationService implements NotificationService{

    @Override
    public void sendNotification(String via, String message) {
        // Send the via sms
    }

    @Override
    public void setTransactionReport(String via, String report) {
        // Send Transaction report via sms
    }

    @Override
    public void sendOTP(String via, String OTP) {
        // Send OTP via sms
    }
}
