public class InvoiceGenerate implements GenerateInvoice {

    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
