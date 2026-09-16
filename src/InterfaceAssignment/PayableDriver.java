package InterfaceAssignment;

import java.util.ArrayList;

public class PayableDriver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        Freelancer freelancer1 = new Freelancer();
        freelancer1.setFirstName("Jack");
        freelancer1.setLastName("Davidson");
        freelancer1.setHourlyRate(16.50);
        freelancer1.setHoursWorked(48.00);

        Freelancer freelancer2 = new Freelancer();
        freelancer2.setFirstName("Larry");
        freelancer2.setLastName("Bird");
        freelancer2.setHourlyRate(19.50);
        freelancer2.setHoursWorked(34.00);

        VendorInvoice vendorInvoice1 = new VendorInvoice();
        vendorInvoice1.setVendorName("Coffee House");
        vendorInvoice1.setInvoiceNumber("11294");
        vendorInvoice1.setAmountDue(194.28);

        VendorInvoice vendorInvoice2 = new VendorInvoice();
        vendorInvoice2.setVendorName("Tea House");
        vendorInvoice2.setInvoiceNumber("19824");
        vendorInvoice2.setAmountDue(225.19);

        payables.add(freelancer1);
        payables.add(freelancer2);
        payables.add(vendorInvoice1);
        payables.add(vendorInvoice2);

        double totalPayment = 0;

        for (Payable payable : payables) {
            if (payable instanceof Freelancer freelancer) {
                freelancer.print();
            } else if (payable instanceof VendorInvoice vendorInvoice) {
                vendorInvoice.print();
            }

            totalPayment += payable.calculatePayment();
        }

        System.out.println("Total payment needed: $" + totalPayment);

    }
}
