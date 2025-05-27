package com.example.models;

import java.util.ArrayList;

public class ListEmployee {
    private ArrayList<Employee> employees;

    public ListEmployee() {
        employees=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void gen_dataset() {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("John");
        e1.setEmail("john@gmail.com");
        e1.setPhone("09083541633");
        e1.setUsername("john");
        e1.setPassword("123");
        employees.add(e1);

        Employee e2=new Employee();
        e2.setId(2);
        e2.setName("Peter");
        e2.setEmail("peter@gmail.com");
        e2.setPhone("09083563912");
        e2.setUsername("peter");
        e2.setPassword("456");
        employees.add(e2);

        Employee e3=new Employee();
        e3.setId(1);
        e3.setName("Tom");
        e3.setEmail("tom@gmail.com");
        e3.setPhone("07653541633");
        e3.setUsername("tom");
        e3.setPassword("789");
        employees.add(e3);
    }
}
