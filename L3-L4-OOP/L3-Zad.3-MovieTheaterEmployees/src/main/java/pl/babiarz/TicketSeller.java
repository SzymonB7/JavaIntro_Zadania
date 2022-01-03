package pl.babiarz;

public class TicketSeller extends BaseEmployee{


    public TicketSeller(String name, String lastName, int yearOfEmployment) {
        super(name, lastName, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return basicSalary;
    }
}
