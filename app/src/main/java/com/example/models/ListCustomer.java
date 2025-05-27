package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class ListCustomer implements Serializable {
    private ArrayList<Customer>customer;

    public ListCustomer() {
    }

    public ListCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }
    public void addCustomer(Customer c) {
        customer.add(c);
    }
    public void generate_sample_dataset() {
        Random random=new Random();
        for (int i=1;i<=100;i++)
        {
            int id=i;
            String name="Customer "+i;
            String email="customer"+i+"@gmail.com";
            String username="customer"+i;
            String password="123";
            String phone="";
            int provider=random.nextInt(3);
            if (provider==0)
                phone="098";
            else if (provider==1)
                phone="090";
            else
                phone="094";
            for (int p=1;p<=7;p++) {
                phone+=random.nextInt(10);
            }
            Customer c=new Customer(id,name,email,phone,username,password);
            addCustomer(c);
        }
    }
    public boolean isExist(Customer c)
    {
        for (Customer cus: customer)
        {
            if (cus.getId()==c.getId() ||
                cus.getPhone().equals(c.getPhone()) ||
                cus.getEmail().equalsIgnoreCase(c.getEmail()) ||
                cus.getUsername().equalsIgnoreCase(c.getUsername()))
                    return true;
        }
        return false;
    }
}
