package Inheritance;

public class SalariedEmployee extends Employee {
    private Integer weeklySalary;

    public SalariedEmployee() {
        this.weeklySalary = null;
    }

    public void setWeeklySalary(Integer weeklySalary) {
        if (weeklySalary >= 0) {
            this.weeklySalary = weeklySalary;
        }
        else {
            System.out.println("Invalid weekly salary, must be non-negative. Nothing is set.");
        }
    }

    public Integer getWeeklySalary() {
        return this.weeklySalary;
    }
}