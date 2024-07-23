package com.User.User_Management_System.Controller.second.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {
	
	@GetMapping("/getMsg")
	public String getmsg()
	{
		return "second COntroller";
	}
	@PostMapping("/getPostMsg")
	public String getPostmsg()
	{
		return "second but Post COntroller";
	}


}
