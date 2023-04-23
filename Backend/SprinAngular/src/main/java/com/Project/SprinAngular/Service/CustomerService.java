package com.Project.SprinAngular.Service;

import com.Project.SprinAngular.DTO.CustomerDto;
import com.Project.SprinAngular.DTO.CustomerSaveDto;
import com.Project.SprinAngular.DTO.CustomerUpdateDto;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDto customerSaveDto);
    List<CustomerDto> getAllCustomers();
    String updateCustomer(CustomerUpdateDto customerUpdateDto);
    String deleteCustomer(int id);
}
