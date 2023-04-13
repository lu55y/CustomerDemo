package org.example.customerdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.example.customerdemo.model.Customer;
import org.example.customerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    final
    CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl getById ()", id);
        return customerRepository.getReferenceById(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save ()", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete ()", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}
