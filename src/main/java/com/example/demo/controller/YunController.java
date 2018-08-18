package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.YunService;

@Controller
public class YunController {
	@Resource
	private YunService yunService;
	
	@RequestMapping("/index")
	private String index() {
		return "index";
	}

}
