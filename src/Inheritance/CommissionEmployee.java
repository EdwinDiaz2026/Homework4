package Inheritance;

class CommissionEmployee extends Employee {
    private Double commissionRate;
    private Integer grossSales;

    public CommissionEmployee() {
        this.commissionRate = null;
        this.grossSales = null;
    }

    public void setCommissionRate(Double commissionRate) {
        if (commissionRate >= 0) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("This commission rate is not valid. Must be non-negative. Nothing is set.");
        }
    }

    public void setGrossSales(Integer grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            System.out.println("This gross sales value is not valid. Must be non-negative. Nothing is set.");
        }
    }

    public Double getCommissionRate() {
        return this.commissionRate;
    }

    public Integer getGrossSales() {
        return this.grossSales;
    }
}
