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
import com.hexaware.cozyhaven.model.HotelInfo;
import com.hexaware.cozyhaven.service.HotelInfoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/hotelInfo")
public class HotelInfoController {

	@Autowired
    private HotelInfoService hotelInfoService;
	
	@GetMapping(value = "/showHotelInfo")
    public List<HotelInfo> showHotelInfo() {
        return hotelInfoService.showHotelInfo();
    }
	
	@PostMapping(value = "/addHotelInfo")
    public void addHotelInfo(@RequestBody HotelInfo hotelinfo) {
        hotelInfoService.addHotelInfo(hotelinfo);
    }
	
	@DeleteMapping(value="/deleteHotelInfo/{infoid}")
	public void deleteHotelInfo(@PathVariable int infoid) {
		hotelInfoService.deleteHotelInfo(infoid);
	}
	
	@PutMapping(value="/updateHotelInfo")
	public void updateHotelInfo(@RequestBody HotelInfo hotelinfo) {
		hotelInfoService.updateHotelInfo(hotelinfo);
	}
	
	@GetMapping("/hotelinfobyhotelid/{hotelid}")
    public List<HotelInfo> getHotelInfoByHotelId(@PathVariable int hotelid) {
        return hotelInfoService.getHotelInfoByHotelId(hotelid);
    }
}
