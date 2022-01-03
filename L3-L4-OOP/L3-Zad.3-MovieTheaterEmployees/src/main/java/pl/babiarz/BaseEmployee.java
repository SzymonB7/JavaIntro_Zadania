package pl.babiarz;

public abstract class BaseEmployee {
    private String name;
    private String lastName;
    protected final int basicSalary;
    private final int yearOfEmployment;

    public BaseEmployee(String name, String lastName, int basicSalary, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.basicSalary = 3000;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public int getTimeOfEmployment(){
        return 2022 - yearOfEmployment;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }
}
