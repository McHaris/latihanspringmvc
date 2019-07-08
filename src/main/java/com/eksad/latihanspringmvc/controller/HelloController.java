package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
	
	@RequestMapping("/hello")//untuk URL browser
	@ResponseBody
	public String sayController() {
		return "Hello Haris Manaf";
	}
	
	@RequestMapping("/myName")
	@ResponseBody
	public String myName(@RequestParam String myName) {
		return "Hello" + myName ;
	}
	
	@RequestMapping("/namaSaya/{myName}")
	@ResponseBody
	public String namaSaya(@PathVariable String myName) {
		return "Hello " + myName ;
	}
	
	@RequestMapping("/toGoogle")
	@ResponseBody
	public String toGoogle() {
		return "<a href='https://www.google.com' target='_blank'> Klik Disini Bray kalo Mau ke  GOOGLE</a>"
				+ "<br> <a href='https://www.youtube.com' target='_blank'>Klik sini Bray kalo mau Youtuban</a>" ;
	}
}
