package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tiles/bootstrap")
public class BootstrapController {

	@GetMapping("/index")
	public String index() {
		return "/index";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "/blog";
	}
	
	@GetMapping("/shop")
	public String shop() {
		return "/shop";
	}
	
	
	
	
	
}
