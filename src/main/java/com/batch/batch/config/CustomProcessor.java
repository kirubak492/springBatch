package com.batch.batch.config;


import com.batch.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }
}
