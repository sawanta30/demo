package com.example.demo;

public class Employee {

    private int id;
    private String name;
    private EmployeeType employeeType;
    private float salary;
    private Department department;

    public Employee(int id, String name, EmployeeType employeeType, float salary, Department department) {
        this.id = id;
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeType=" + employeeType +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
