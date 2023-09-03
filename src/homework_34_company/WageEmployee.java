package homework_34_company;

public class WageEmployee extends Employee{
    private double wage;

    public WageEmployee(int id, String firstName, String lastName, double hour, double wage) {
        super(id, firstName, lastName, hour);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}'+ super.calculateSalary;
    }

    public double calculateSalary() {
        double salary = getHour() * wage;
        if (salary <= getHour() * StateConstans.MIN_WAGE) ;

        return salary;
    }
}
