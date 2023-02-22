	package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dto.Customer;
import com.jsp.dto.Room;
import com.jsp.service.CustomerService;
import com.jsp.service.RoomService;

public class CustomerController {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_name("SALMANKHAN");
		customer.setCustomer_phnone_num("97356487665");
		customer.setCustomer_aadhar_num("47256378265677");

		Room room = new Room();
		room.setRoom_id(2);
		room.setCustomer(customer);

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room);

		customer.setRooms(rooms);

		CustomerService customerService = new CustomerService();
		customerService.create(customer);

		RoomService roomService = new RoomService();
		roomService.update(room);
	}
}
