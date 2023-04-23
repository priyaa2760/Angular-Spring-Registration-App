package com.Project.SprinAngular.Service;

import com.Project.SprinAngular.DTO.CustomerDto;
import com.Project.SprinAngular.DTO.CustomerSaveDto;
import com.Project.SprinAngular.DTO.CustomerUpdateDto;
import com.Project.SprinAngular.Entity.Customer;
import com.Project.SprinAngular.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveDto customerSaveDto) {
        Customer customer =
                Customer.builder()
                        .customerName(customerSaveDto.getCustomerName())
                        .customerAddress(customerSaveDto.getCustomerAddress())
                        .mobileNo(customerSaveDto.getMobileNo())
                        .build();
        customerRepo.save(customer);
        return customer.getCustomerName();
    }

    @Override
    public List<CustomerDto> getAllCustomers(){
        List<Customer> customers=customerRepo.findAll();
        List<CustomerDto> customerDtos=new ArrayList<>();
        customers.forEach(customer -> customerDtos.add(
                CustomerDto.builder()
                        .customerId(customer.getCustomerId())
                        .customerName(customer.getCustomerName())
                        .customerAddress(customer.getCustomerAddress())
                        .mobileNo(customer.getMobileNo())
                        .build()
        ) );
        return customerDtos;
    }

    @Override
    public String updateCustomer(CustomerUpdateDto customerUpdateDto) {
        if (customerRepo.existsById(customerUpdateDto.getCustomerId())) {
            Customer customer = customerRepo.getById(customerUpdateDto.getCustomerId());
            customer.setCustomerAddress(customerUpdateDto.getCustomerAddress());
            customer.setCustomerName(customerUpdateDto.getCustomerName());
            customer.setMobileNo(customerUpdateDto.getMobileNo());
            customerRepo.save(customer);
            return "Successfully updated";
        }
        return "Customer does not exist";
    }
    public String deleteCustomer(int id){
        if(customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        return "successfully deleted";
        }
        return "customer id does not exist";
    }

}
