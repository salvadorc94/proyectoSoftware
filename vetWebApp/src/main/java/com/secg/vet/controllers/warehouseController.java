package com.secg.vet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class warehouseController {
	@GetMapping("/warehouse")
	public String warehouse() {
		return "warehouse";
	}
}
