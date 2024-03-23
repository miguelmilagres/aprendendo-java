package entities;

import java.util.List;
import java.util.ArrayList;
import entities.enums.WorkerLevel;
import java.time.LocalDate;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        Double sum = baseSalary;
        for (HourContract c : contracts) {
            LocalDate date = c.getDate();
            int c_year = date.getYear();
            int c_month = date.getMonthValue();
            if (year == c_year && month == c_month) {
                sum += c.totalValues();
            }
        }

        return sum;
    }
}