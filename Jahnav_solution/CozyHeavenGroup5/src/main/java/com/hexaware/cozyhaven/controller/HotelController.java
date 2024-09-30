package com.hexaware.cozyhaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cozyhaven.model.Hotel;
import com.hexaware.cozyhaven.service.HotelService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/hotel")
public class HotelController {

	 @Autowired
	    private HotelService hotelService;
	 
	 @PostMapping(value = "/addHotel")
	    public void addHotel(@RequestBody Hotel hotel) {
	        hotelService.addHotel(hotel);
	    }
	 
	 @RequestMapping(value = "/showHotels")
	    public List<Hotel> showAllHotels() {
	        return hotelService.showAllHotels();
	    }
	 
	 @RequestMapping(value = "/searchByCity/{city}")
	    public List<Hotel> searchByCity(@PathVariable String city) {
	        return hotelService.searchByCity(city);
	    }
	 
	 @RequestMapping(value = "/searchByType/{hotelType}")
	    public List<Hotel> searchByHotelType(@PathVariable String hotelType) {
	        return hotelService.searchByHotelType(hotelType);
	    }
	 
	 @DeleteMapping(value="/deleteHotel/{hotelid}")
		public void deleteHotel(@PathVariable int hotelid) {
			hotelService.deleteHotel(hotelid);
		}
		
		@PutMapping(value="/updateHotel")
		public void updateHotel(@RequestBody Hotel hotel) {
			hotelService.updateHotel(hotel);
		}
}
