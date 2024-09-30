package com.hexaware.cozyhaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cozyhaven.model.Hotel;
//import com.hexaware.cozyhaven.model.Hotel;
import com.hexaware.cozyhaven.model.HotelInfo;
import com.hexaware.cozyhaven.repository.HotelInfoRepository;

@Service
public class HotelInfoService {

    @Autowired
    private HotelInfoRepository hotelInfoRepo;

 
    public HotelInfo getHotelInfoById(int infoId) {
        return hotelInfoRepo.findById(infoId).orElse(null);
    }

 
    public void addHotelInfo(HotelInfo hotelInfo) {
        hotelInfoRepo.save(hotelInfo); 
    }

    public List<HotelInfo> getHotelInfoByHotelId(int hotelid) {
        return hotelInfoRepo.findByHotel_hotelid(hotelid);
    }
    

	public List<HotelInfo> showHotelInfo() {
		return hotelInfoRepo.findAll();
	}
	
	public void updateHotelInfo(HotelInfo hotelinfo) {
		hotelInfoRepo.save(hotelinfo);
	}
	
	public void deleteHotelInfo(int infoid) {
		hotelInfoRepo.deleteById(infoid);
	}
}
