package com.study.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.domain.MemberVO;
import com.study.spring.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	@Inject
	private MemberService service;	
		
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {
		List<MemberVO> member_list = service.getList();
		model.addAttribute("list",member_list);
		return "member_list";
	}
		
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String memberInsert(MemberVO vo, Model model) {
		service.insertMember(vo);
		return "redirect:/member";
	}	
	
	@RequestMapping(value = "/memberWrite", method = RequestMethod.GET)
		public void memberWrite(Locale locale, Model model){
	}
}
