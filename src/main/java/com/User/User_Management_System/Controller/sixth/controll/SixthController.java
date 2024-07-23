package com.User.User_Management_System.Controller.sixth.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SixthController {

	
	@GetMapping("/getSixMsg")
	public String getmsg()
	{
		return "sixth COntroller";
	}
	@PostMapping("/getSixPostMsg")
	public String getPostmsg()
	{
		return "sixth but Post COntroller";
	}
}
