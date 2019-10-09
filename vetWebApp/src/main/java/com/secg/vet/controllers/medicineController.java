package com.secg.vet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class medicineController {
	@GetMapping("/medicine")
	public String medicine() {
		return "medicine";
	}
}
