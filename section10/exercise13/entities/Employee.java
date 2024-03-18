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

    public void increaseSalary(double percentage) {
        salary *= (1 + (percentage/100));
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
