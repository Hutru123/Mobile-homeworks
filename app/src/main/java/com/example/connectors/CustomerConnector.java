package com.example.connectors;

import com.example.models.Customer;
import com.example.models.ListCustomer;

import java.util.ArrayList;

public class CustomerConnector {
    ListCustomer listCustomer;
    public CustomerConnector() {
        listCustomer=new ListCustomer();
        listCustomer.generate_sample_dataset();
    }
    public ArrayList<Customer> get_all_customer() {
        if (listCustomer == null)
        {
            listCustomer=new ListCustomer();
            listCustomer.generate_sample_dataset();
        }
        return listCustomer.getCustomer();
    }
    public ArrayList<Customer> get_customer_by_provider(String provider) {
        if (listCustomer == null)
        {
            listCustomer=new ListCustomer();
            listCustomer.generate_sample_dataset();
        }
        ArrayList<Customer>results=new ArrayList<>();
        for(Customer c: listCustomer.getCustomer())
        {
            if(c.getPhone().startsWith(provider)) {
                results.add(c);
            }
        }
        return results;
    }
    public boolean isExist(Customer c)
    {
        return listCustomer.isExist(c);
    }
    public void addCustomer(Customer c)
    {}

}

