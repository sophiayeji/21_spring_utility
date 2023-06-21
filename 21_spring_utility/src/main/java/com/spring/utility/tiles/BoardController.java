package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/board")
public class BoardController {
	
	@GetMapping("/boardList")
	public ModelAndView boardList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dd");
		return mv;		
	}

	@GetMapping("/boardWrite")
	public ModelAndView boardWrite() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ee");
		return mv;		
	}
	
	@GetMapping("/boardUpdate")
	public ModelAndView boardUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ff");
		return mv;		
	}
	@GetMapping("/boardDelete")
	public ModelAndView boardDelete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("gg");
		return mv;		
	}
}
/*
1. BoardController를 생성하여 아래의 요청 url과 jsp파일을 연결한다.

- 왼쪽 4개의 url을 오른쪽의 jsp파일과 연결한다.

	1) localhost:8080/utility/tiles/board/boardList	 > tiles/board폴더의 bList.jsp로 연결한다. title명은  '게시글 목록'으로 설정한다.
	2) localhost:8080/utility/tiles/board/boardWrite >tiles/board폴더의 bWrite.jsp로 연결한다. title명은  '게시글 작성'으로 설정한다.
	
	3-4)예시는 ModelAndView 형태로 연결한다.
	
	3) localhost:8080/utility/tiles/board/boardUpdate >	tiles/board폴더의 bUpdate.jsp로 연결한다. title명은  '게시글 수정'으로 설정한다.
	4) localhost:8080/utility/tiles/board/boardDelete >	tiles/board폴더의 bDelete.jsp로 연결한다. title명은  '게시글 삭제'으로 설정한다.

2. tiles 설정파일은 tiles폴더의 board.xml로 생성하고 
 template은 tiles교육때 사용하던 layout.jsp , header.jsp , footer.jsp , side.jsp를 그대로 사용한다.
*/