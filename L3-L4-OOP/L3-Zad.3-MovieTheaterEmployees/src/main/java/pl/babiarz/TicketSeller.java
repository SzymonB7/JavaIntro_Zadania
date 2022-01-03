package pl.babiarz;

public class TicketSeller extends BaseEmployee{


    public TicketSeller(String name, String lastName, int basicSalary, int yearOfEmployment) {
        super(name, lastName, basicSalary, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return basicSalary;
    }
}
