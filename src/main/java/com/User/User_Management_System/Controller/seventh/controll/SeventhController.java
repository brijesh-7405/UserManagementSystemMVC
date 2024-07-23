package com.User.User_Management_System.Controller.seventh.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeventhController {

	
	@GetMapping("/getSevenMsg")
	public String getmsg()
	{
		return "second COntroller";
	}
	@PostMapping("/getSevenPostMsg")
	public String getPostmsg()
	{
		return "second but Post COntroller";
	}
}
