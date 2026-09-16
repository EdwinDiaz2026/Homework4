package InterfaceAssignment;

public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private Double amountDue;

    public VendorInvoice() {
        this.vendorName = null;
        this.invoiceNumber = null;
        this.amountDue = null;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(Double amountDue) {
        if (amountDue >= 0) {
            this.amountDue = amountDue;
        }
        else {
            System.out.println("Invalid amount due. Value must be non-negative. Nothing has been set.");
        }
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public Double getAmountDue() {
        return this.amountDue;
    }

    @Override
    public double calculatePayment() {
        return getAmountDue();
    }

    @Override
    public String getPayeeName() {
        return getVendorName();
    }

    public void print() {
        System.out.println("Vendor name: " + getPayeeName() + ". Invoice #: " + getInvoiceNumber() +
                ". Amount due: $" + calculatePayment());
    }
}
