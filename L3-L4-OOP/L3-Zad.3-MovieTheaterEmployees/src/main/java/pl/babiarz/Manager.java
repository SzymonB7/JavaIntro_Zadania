package pl.babiarz;

public class Manager extends BaseEmployee{

    private int bonus;

    public Manager(String name, String lastName, int basicSalary, int yearOfEmployment) {
        super(name, lastName, 5000, yearOfEmployment);
        this.bonus = 500;
    }

    @Override
    public int calculateMonthlySalary() {
        return basicSalary + bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
