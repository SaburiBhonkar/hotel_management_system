package com.jsp.controller;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

public class TestSaveLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setName("SABURI");
		landLord.setAddress("AIROLI");
		landLord.setStatus("approved");

		LandLord landLord1 = new LandLord();
		landLord1.setName("SNEHA");
		landLord1.setAddress("VASHI");
		landLord.setStatus("approved");

		LandLord landLord2 = new LandLord();
		landLord2.setName("PRIYANKA");
		landLord2.setAddress("MANSAROVAR");
		landLord.setStatus("approved");

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);
		
		
	}

}
