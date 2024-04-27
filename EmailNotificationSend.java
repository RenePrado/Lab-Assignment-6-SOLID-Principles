public class EmailNotificationSend implements SendEmailNotification {

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to " + email);
    }
}
