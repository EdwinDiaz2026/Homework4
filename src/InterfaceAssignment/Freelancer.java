package InterfaceAssignment;

public class Freelancer implements Payable {
    private String firstName;
    private String lastName;

    private Double hourlyRate;
    private Double hoursWorked;

    public Freelancer() {
        this.firstName = null;
        this.lastName = null;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHourlyRate(Double hourlyRate) {
        if(hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
        else {
            System.out.println("Hourly rate not valid. Nothing is set.");
        }
    }

    public void setHoursWorked(Double hoursWorked) {
        if(hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
        else {
            System.out.println("Hours worked not valid. Nothing is set.");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Double getHourlyRate() {
        return this.hourlyRate;
    }

    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public double calculatePayment() {
        double totalPayment = 0;
        if(this.hoursWorked > 40) {
            double hoursOvertime = this.hoursWorked - 40;
            double regularHoursWorked = this.hoursWorked - hoursOvertime;
            double paidOvertime = hoursOvertime * this.hourlyRate * 1.5;
            double paidRegularTime = regularHoursWorked * this.hourlyRate;

            totalPayment = paidOvertime + paidRegularTime;
        }
        else {
            totalPayment = this.hoursWorked * this.hourlyRate;
        }
        return totalPayment;
    }

    @Override
    public String getPayeeName() {
        return this.firstName + " " + this.lastName;
    }

    public void print() {
        System.out.println("Payee's name is: " + getPayeeName() + " and their payment is: $" + calculatePayment());
    }
}
