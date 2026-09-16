package Inheritance;

class HourlyEmployee extends Employee {
    private Integer wage;
    private Integer numberOfHoursWorked;

    public HourlyEmployee() {
        this.wage = null;
        this.numberOfHoursWorked = null;
    }

    public void setWage(Integer wage) {
        if (wage >= 0) {
            this.wage = wage;
        } else {
            System.out.println("Invalid wage. Value must be non-negative. Nothing is set.");
        }
    }

    public void setNumberOfHoursWorked(Integer numberOfHoursWorked) {
        if (numberOfHoursWorked >= 0) {
            this.numberOfHoursWorked = numberOfHoursWorked;
        } else {
            System.out.println("Invalid number of hours, must be non-negative. Nothing is set.");
        }
    }

    public Integer getWage() {
        return this.wage;
    }

    public Integer getNumberOfHoursWorked() {
        return this.numberOfHoursWorked;
    }
}
