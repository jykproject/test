package com.study.springrest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.springrest.domain.ReplyVO;
import com.study.springrest.service.ReplyService;





/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/reply")
public class Reply {
	@Inject
	private ReplyService service;
	
	// À¯´Ö/		¸ñ·Ï
	@RequestMapping(value = "/{board_no}", method = RequestMethod.GET)
	public ResponseEntity<List<ReplyVO>> list() {
		
		ResponseEntity<List<ReplyVO>> entity = null;
		try{	
			entity = new ResponseEntity<>(service.getList(), HttpStatus.OK);
		}catch(Exception e){	
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}

	// À¯´Ö
	@RequestMapping(value = "", method = RequestMethod.POST)
		public ModelAndView insert(@RequestBody ReplyVO vo){
		return new ModelAndView("redirect:/rest");
	}
	
	
}
