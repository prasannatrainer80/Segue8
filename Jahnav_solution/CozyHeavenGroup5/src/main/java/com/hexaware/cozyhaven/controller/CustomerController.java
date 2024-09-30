package com.hexaware.cozyhaven.controller;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cozyhaven.model.Customer;
import com.hexaware.cozyhaven.model.Hotel;
import com.hexaware.cozyhaven.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping(value = "/addCustomer")
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }
    
    @RequestMapping(value = "/showCustomer")
    public List<Customer> list() {
        return service.showCustomer();
    }

    @RequestMapping("/custAuthenticate/{user}/{pwd}")
    public String authenticate(@PathVariable String user, @PathVariable String pwd) {
        return service.authenticate(user, pwd);
    }

    @RequestMapping("/searchByUser/{userName}")
    public ResponseEntity<Customer> searchByUserName(@PathVariable String userName) {
        try {
            Customer customer = service.searchByUserName(userName);
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
    @RequestMapping("/customers/{id}")
    public ResponseEntity<Customer> get(@PathVariable int id) {
        try {
            Customer customer = service.search(id);
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
