public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        GenerateInvoice generateInvoice = new InvoiceGenerate();
        SendEmailNotification sendEmailNotification = new EmailNotificationSend();

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        generateInvoice.generateInvoice("order_123.pdf");
        sendEmailNotification.sendEmailNotification("johndoe@example.com");
    }
}
