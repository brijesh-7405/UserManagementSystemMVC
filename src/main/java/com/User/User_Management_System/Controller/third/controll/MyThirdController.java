package com.User.User_Management_System.Controller.third.controll;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyThirdController {

	@GetMapping("/getthirdMsg")
	public String getmsg()
	{
		return "third COntroller";
	}
	@GetMapping(value = "/show")
    public ModelAndView show() {

        ModelAndView mav = new ModelAndView();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String dateTimeFormatted = formatter.format(now);

        mav.addObject("now", dateTimeFormatted);
        mav.setViewName("show");

        return mav;
    }

}
