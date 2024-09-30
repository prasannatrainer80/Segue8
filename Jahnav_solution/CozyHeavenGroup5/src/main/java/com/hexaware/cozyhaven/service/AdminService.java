package com.hexaware.cozyhaven.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.cozyhaven.AdminDetails;
import com.hexaware.cozyhaven.dao.AdminDAO;
import com.hexaware.cozyhaven.model.Admin;
import com.hexaware.cozyhaven.repository.AdminRepository;

@Service
public class AdminService implements UserDetailsService{

    @Autowired
    private AdminRepository adminRepo;
    
    @Lazy
	@Autowired
	private PasswordEncoder encoder;

    @Autowired
    private AdminDAO dao;

    public String authenticate(String user, String pwd) {
        return dao.authenticate(user, pwd);
    }

    public List<Admin> showAdmin() {
        return adminRepo.findAll();
    }

    public String addAdminDao(Admin admin) {
		admin.setPassword(encoder.encode(admin.getPassword()));
		adminRepo.save(admin);
		return "Admin Record Inserted...";
	}

    public Admin searchByUserName(String user) {
        return dao.searchByUser(user);
    }
    
    public Admin search(int adminId) {
        return adminRepo.findById(adminId).orElse(null);
    }
    
    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		  Optional<Admin> userDetail = adminRepo.findByAdminname(username);
		  System.out.println(userDetail);
	        // Converting userDetail to EmployDetails
	        return userDetail.map(AdminDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
	}
}
