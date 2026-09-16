package Inheritance;

class BaseEmployee extends Employee {
    private Integer baseSalary;

    public BaseEmployee() {
        this.baseSalary = null;
    }

    public void setBaseSalary(Integer baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("This base salary is not valid. Must be non-negative. Nothing is set.");
        }
    }

    public Integer getBaseSalary() {
        return this.baseSalary;
    }
}
