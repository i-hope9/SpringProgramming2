package com.mycompany.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.web.dto.Ch05Board;

@Controller
@RequestMapping("/ch05")
public class Ch05Controller {

	@RequestMapping("/content")
	public String content() {
		return "ch05/content";
	}
	
	@RequestMapping("/getBoardList")
	public String getBoardList(int pageNo, Model model) {	
		int startNo = (pageNo - 1) * 10 + 1;
		int endNo = pageNo * 10;
		
		List<Ch05Board> boardList = new ArrayList<>();  
		for(int i = startNo; i <= endNo; i++) {
			Ch05Board board = new Ch05Board();
			board.setBno(i);
			board.setBtitle("성실한 자가 성공한다. " + i);
			board.setBcontent("꾸준히 반복 반복 학습하면 언젠가는 전문가 된다.");
			board.setBwriter("감자바");
			board.setDate(new Date());
			board.setHitcount(1);
			
			boardList.add(board);
		}
		
		model.addAttribute("boardList", boardList);	//모델에 저장하면 자동으로 jsp에 이동
		model.addAttribute("totalNo", 100);
		
		//return "ch05/getBoardList";
		return "ch05/getBoardList2";
	}
}
