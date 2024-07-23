package com.User.User_Management_System.Controller.fifth.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FifthController {
	@GetMapping("/getfifthMsg")
	public String getmsg()
	{
		return "second COntroller";
	}
	@PostMapping("/getfifthPostMsg")
	public String getPostmsg()
	{
		return "second but Post COntroller";
	}
}
