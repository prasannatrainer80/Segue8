package com.hexaware.cozyhaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.cozyhaven.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository <Hotel, Integer>{

}
