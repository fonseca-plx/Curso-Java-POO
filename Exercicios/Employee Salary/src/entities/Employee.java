package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = salary * (1 + percentage/100.0);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", getId(), getName(), getSalary());
    }
}
