package pl.babiarz;

import java.time.LocalDate;

public abstract class BaseEmployee {
    private final String name;
    private final String lastName;
    protected final int basicSalary;
    private final int yearOfEmployment;

    protected BaseEmployee(String name, String lastName, int basicSalary, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public BaseEmployee(String name, String lastName, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.basicSalary = 3000;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public int getTimeOfEmployment(){
        return LocalDate.now().getYear() - yearOfEmployment;
    }

    public int getBasicSalary() {
        return basicSalary;
    }
}
