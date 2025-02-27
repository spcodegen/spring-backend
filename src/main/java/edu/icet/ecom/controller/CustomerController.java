package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/get-all")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }

    @PutMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

    @GetMapping("/search-by-id/{id}")
    public Customer searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Customer> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }
}
