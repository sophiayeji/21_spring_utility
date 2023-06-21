package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/member")
public class MemberController_answer_sample {
	
	@RequestMapping(value="/login_answer_sample" , method=RequestMethod.GET)
	public String login() {
		return "member/login_answer_sample";
	}
	
	@RequestMapping(value="/detail_answer_sample" , method=RequestMethod.GET)
	public String memberDetail() {
		return "member/detail_answer_sample";
	}
	
	@RequestMapping(value="/cart_answer_sample" , method=RequestMethod.GET)
	public ModelAndView cart() {
		return new ModelAndView("member/cart_answer_sample");
	}
	
	@RequestMapping(value="/myPage_answer_sample" , method=RequestMethod.GET)
	public ModelAndView myPage() {
		return new ModelAndView("member/myPage_answer_sample");
	}
	
}
