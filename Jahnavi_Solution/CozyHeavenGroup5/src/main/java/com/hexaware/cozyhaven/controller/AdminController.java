package com.hexaware.cozyhaven.controller;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import com.hexaware.cozyhaven.AuthRequest;
//import com.hexaware.cozyhaven.JwtService;
import com.hexaware.cozyhaven.model.Admin;
import com.hexaware.cozyhaven.service.AdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
//    @Autowired
//    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping(value = "/showAdmin")
    public List<Admin> showAdmin() {
        return adminService.showAdmin();
    }

    @PostMapping(value = "/addAdmin")
    public void addAdmin(@RequestBody Admin admin) {
        adminService.addAdminDao(admin);
    }
    

    @RequestMapping("/adminAuthenticate/{user}/{pwd}")
    public String authenticate(@PathVariable String user, @PathVariable String pwd) {
        return adminService.authenticate(user, pwd);
    }

    @RequestMapping("/searchByUser/{userName}")
    public ResponseEntity<Admin> searchByUserName(@PathVariable String userName) {
        try {
            Admin admin = adminService.searchByUserName(userName);
            return new ResponseEntity<>(admin, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping("/admins/{id}")
    public ResponseEntity<Admin> get(@PathVariable int id) {
        try {
            Admin admin = adminService.search(id);
            return new ResponseEntity<>(admin, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
//    @PostMapping("/generateToken")
//    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
//        if (authentication.isAuthenticated()) {
//            return jwtService.generateToken(authRequest.getUsername());
//        } else {
//            throw new UsernameNotFoundException("invalid user request !");
//        }
//    }
    
    @GetMapping("/user/{username}")
    public ResponseEntity<UserDetails> getUserByUsername(@PathVariable String username) {
        try {
            UserDetails userDetails = adminService.loadUserByUsername(username);
            return ResponseEntity.ok(userDetails);
        } catch (UsernameNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
