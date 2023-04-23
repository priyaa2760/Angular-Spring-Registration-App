package com.Project.SprinAngular.Controller;

import com.Project.SprinAngular.DTO.CustomerDto;
import com.Project.SprinAngular.DTO.CustomerSaveDto;
import com.Project.SprinAngular.DTO.CustomerUpdateDto;
import com.Project.SprinAngular.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDto customerSaveDto) {
        String name = customerService.addCustomer(customerSaveDto);
        return name;
    }

    @GetMapping(path = "/getAllCustomers")
    public List<CustomerDto> getAllCustomers(){
        List<CustomerDto> customerDtos=customerService.getAllCustomers();
        return customerDtos;
    }

    @PutMapping(path = "/updateCustomer")
    public String updateCustomer(@RequestBody CustomerUpdateDto customerUpdateDto){
        String name=customerService.updateCustomer(customerUpdateDto);
        return name;
    }

    @DeleteMapping(path = "/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(value="id") int id )
    {
        return customerService.deleteCustomer(id);
    }
}
