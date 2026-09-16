package InterfaceAssignment;

public interface Payable {
    //returns the amount to be paid for this period
    double calculatePayment();

    //returns the name of the person or entity being paid
    String getPayeeName();
}
