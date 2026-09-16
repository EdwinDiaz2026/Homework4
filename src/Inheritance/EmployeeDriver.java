package Inheritance;

public class EmployeeDriver {
    public static void main(String[] args) {

        //First Employee in table: Salaried Employee Joe Jones
        SalariedEmployee salariedEmployee1 = new SalariedEmployee();
        salariedEmployee1.setFirstName("Joe");
        salariedEmployee1.setLastName("Jones");
        salariedEmployee1.setSocialSecurityNumber("111-11-1111");
        salariedEmployee1.setWeeklySalary(2500);

        //Second Employee in table: Hourly Employee Stephanie Smith
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
        hourlyEmployee1.setFirstName("Stephanie");
        hourlyEmployee1.setLastName("Smith");
        hourlyEmployee1.setSocialSecurityNumber("222-22-2222");
        hourlyEmployee1.setWage(25);
        hourlyEmployee1.setNumberOfHoursWorked(32);

        //Third Employee in table: Hourly Employee Mary Quinn
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee();
        hourlyEmployee2.setFirstName("Mary");
        hourlyEmployee2.setLastName("Quinn");
        hourlyEmployee2.setSocialSecurityNumber("333-33-3333");
        hourlyEmployee2.setWage(19);
        hourlyEmployee2.setNumberOfHoursWorked(47);

        //Fourth Employee in table: Commission Employee Nicole Dior
        CommissionEmployee commissionEmployee1 = new CommissionEmployee();
        commissionEmployee1.setFirstName("Nicole");
        commissionEmployee1.setLastName("Dior");
        commissionEmployee1.setSocialSecurityNumber("444-44-4444");
        commissionEmployee1.setCommissionRate(0.15);
        commissionEmployee1.setGrossSales(50000);

        //Fifth Employee in table: Salaried Employee Renwa Chanel
        SalariedEmployee salariedEmployee2 = new SalariedEmployee();
        salariedEmployee2.setFirstName("Renwa");
        salariedEmployee2.setLastName("Chanel");
        salariedEmployee2.setSocialSecurityNumber("555-55-5555");
        salariedEmployee2.setWeeklySalary(1700);

        //Sixth Employee in table: Base Employee Mike Davenport
        BaseEmployee baseEmployee1 = new BaseEmployee();
        baseEmployee1.setFirstName("Mike");
        baseEmployee1.setLastName("Davenport");
        baseEmployee1.setSocialSecurityNumber("666-66-6666");
        baseEmployee1.setBaseSalary(95000);

        //Seventh Employee in table: Commission Employee Mahnaz Vaziri
        CommissionEmployee commissionEmployee2 = new CommissionEmployee();
        commissionEmployee2.setFirstName("Mahnaz");
        commissionEmployee2.setLastName("Vaziri");
        commissionEmployee2.setSocialSecurityNumber("777-77-7777");
        commissionEmployee2.setCommissionRate(0.22);
        commissionEmployee2.setGrossSales(40000);

        //Print all employee info
        System.out.println("Employee #1 info:");
        System.out.println("Name: " + salariedEmployee1.getFirstName() + " " + salariedEmployee1.getLastName());
        System.out.println("SSN: " + salariedEmployee1.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + salariedEmployee1.getWeeklySalary());
        System.out.println();

        System.out.println("Employee #2 info:");
        System.out.println("Name: " + hourlyEmployee1.getFirstName() + " " + hourlyEmployee1.getLastName());
        System.out.println("SSN: " + hourlyEmployee1.getSocialSecurityNumber());
        System.out.println("Hourly Wage: " + hourlyEmployee1.getWage());
        System.out.println("Hours Worked: " + hourlyEmployee1.getNumberOfHoursWorked());
        System.out.println();

        System.out.println("Employee #3 info: ");
        System.out.println("Name: " + hourlyEmployee2.getFirstName() + " " + hourlyEmployee2.getLastName());
        System.out.println("SSN: " + hourlyEmployee2.getSocialSecurityNumber());
        System.out.println("Hourly Wage: " + hourlyEmployee2.getWage());
        System.out.println("Hours Worked: " + hourlyEmployee2.getNumberOfHoursWorked());
        System.out.println();

        System.out.println("Employee #4 info: ");
        System.out.println("Name: " + commissionEmployee1.getFirstName() + " " + commissionEmployee1.getLastName());
        System.out.println("SSN: " + commissionEmployee1.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + commissionEmployee1.getCommissionRate());
        System.out.println("Gross Sales: " + commissionEmployee1.getGrossSales());
        System.out.println();

        System.out.println("Employee 5 info: ");
        System.out.println("Name: " + salariedEmployee2.getFirstName() + " " + salariedEmployee2.getLastName());
        System.out.println("SSN: " + salariedEmployee2.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + salariedEmployee2.getWeeklySalary());
        System.out.println();

        System.out.println("Employee 6 info:");
        System.out.println("Name: " + baseEmployee1.getFirstName() + " " + baseEmployee1.getLastName());
        System.out.println("SSN: " + baseEmployee1.getSocialSecurityNumber());
        System.out.println("Base Salary: $" + baseEmployee1.getBaseSalary());
        System.out.println();

        System.out.println("Employee 7 info: ");
        System.out.println("Name: " + commissionEmployee2.getFirstName() + " " + commissionEmployee2.getLastName());
        System.out.println("SSN: " + commissionEmployee2.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + commissionEmployee2.getCommissionRate());
        System.out.println("Gross sales: " + commissionEmployee2.getGrossSales());
        System.out.println();

    }
}
