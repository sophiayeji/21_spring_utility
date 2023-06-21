package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {

	@GetMapping("/content1")
	public String content1() {
		//return "tiles/tilesEx/content1"; // before (화면일 잘 안나왔을 떄 확인하는 과정(tiles를 거치치 않고 진행을함)) 
		return "/aaa"; // (after) definition태그의 name속성과 바인딩 		
	}
	
	@GetMapping("/content2")
	public ModelAndView content2() {
		
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("tiles/tilesEx/content2");
		mv.setViewName("/bbb");
		
		return mv;
	}	
	
	@GetMapping("/content3")
	public ModelAndView content3() {
		
		//return new ModelAndView("tiles/tilesEx/content3"); // before
		return new ModelAndView("/ccc"); // (after) definition태그의 name속성과 바인딩 	
	}	
}
	
	
	

