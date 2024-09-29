package com.hexaware.cozyhaven.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.cozyhaven.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Optional<Admin> findByAdminname(String username);
}
