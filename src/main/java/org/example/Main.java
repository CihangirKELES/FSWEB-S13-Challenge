package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        //hplans
        Healthplan healthplan1 = new Healthplan(1, "John's Plan", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Jane's Plan", Plan.PREMIUM);

        //emp.
        String[] employeeHealthPlans = new String[2];
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", employeeHealthPlans);
        employee.addHealthPlan(0, healthplan1.getName());

        //comp.
        String[] employees = new String[2];
        Company company = new Company(1, "Workintech", 1000, employees);
        company.addEmployee(0, employee.getFullName());

        //test
        System.out.println(healthplan1);
        System.out.println(healthplan2);
        System.out.println(employee);
        System.out.println(company);
    }
}
