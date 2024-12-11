package amolnandiwale.solidprinciples.ocp;

/**
 * OCP violation code example
 *
 * @author Amol Nandiwale
 */
public interface NotificationService {

    /**
     * Send notification to the given medium(Mobile SMS, WhatsApp, Email)
     *
     * @param via the medium to send notification to (Mobile SMS, WhatsApp, Email)
     * @param message the notification message
     */
    void sendNotification(String via, String message);

    /**
     * Send notification to the given medium(Mobile SMS, WhatsApp, Gmail, Email)
     *
     * @param via the medium to send notification to (Mobile SMS, WhatsApp, Gmail, Email, etc...)
     * @param report the notification report
     */
    void setTransactionReport(String via, String report);

    /**
     * Send OTP to the given medium(Mobile SMS, Email)
     *
     * @param via the medium to send OTP to (Mobile SMS, Email, etc...)
     * @param OTP the OTP to be sent
     */
    void sendOTP(String via, String OTP);

}
