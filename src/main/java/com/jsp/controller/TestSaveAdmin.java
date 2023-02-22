package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class TestSaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("SABURI");
		admin.setEmail_id("saburi67@gmail.com");

		AdminService adminService = new AdminService();
		adminService.create(admin);

	}
}
