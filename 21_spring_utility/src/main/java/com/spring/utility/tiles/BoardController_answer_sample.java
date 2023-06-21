package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/board")
public class BoardController_answer_sample {

	@RequestMapping(value = "/boardList_answer_sample" , method = RequestMethod.GET)		
	public String boardList() {
		return "board/boardList_answer_sample";	
	}
	
	@RequestMapping(value = "/boardWrite_answer_sample" , method = RequestMethod.GET)		
	public String boardWrite() {
		return "board/boardWrite_answer_sample";
	}
	
	@RequestMapping(value = "/boardUpdate_answer_sample" , method = RequestMethod.GET)		
	public ModelAndView boardUpdate() {
		return new ModelAndView("board/boardUpdate_answer_sample");
	}
	
	@RequestMapping(value = "/boardDelete_answer_sample" , method = RequestMethod.GET)		
	public ModelAndView boardDelete() {
		return new ModelAndView("board/boardDelete_answer_sample");
	}
	
}
