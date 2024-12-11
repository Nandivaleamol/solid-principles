package amolnandiwale.solidprinciples.ocp;

// OCP violation: The code does not adhere to the Open-Closed Principle (OCP)
public class BadNotificationService {

    public void sendNotification(String via, String message) {
        if (via.equals("mobile")){
            // Send via mobile notification
        } else if (via.equals("whatsApp")) {
            // Send via WhatsApp notification
        } else if (via.equals("email")) {
            // Send via email notification
        }else {
            throw new IllegalArgumentException("Invalid notification via: " + via);
        }
    }

    public void setTransactionReport(String via, String report) {
        if (via.equals("mobile")){
            // Send via mobile notification
        } else if (via.equals("whatsApp")) {
            // Send via WhatsApp notification
        } else if (via.equals("email")) {
            // Send via email notification
        } else {
            throw new IllegalArgumentException("Invalid notification via: " + via);
        }

    }

    public void sendOTP(String via, String OTP) {
        if (via.equals("mobile")){
            // Send via mobile notification
        } else if (via.equals("whatsApp")) {
            // Send via WhatsApp notification
        } else if (via.equals("email")) {
            // Send via email notification
        } else {
            throw new IllegalArgumentException("Invalid notification via: " + via);
        }
    }
}
