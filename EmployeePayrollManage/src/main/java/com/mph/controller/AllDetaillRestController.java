package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.AllDetail;
import com.mph.service.AllDetailService;

@RestController
@RequestMapping("/attdetail")
@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "http://localhost:4200", methods = {
		RequestMethod.GET, RequestMethod.POST })
public class AllDetaillRestController {
	@Autowired
	public AllDetailService attDetailService;
	
	
	@GetMapping("/allAttDetail")
	public ResponseEntity<List<AllDetail>> listAllAttDetail() {
		List<AllDetail> ld = attDetailService.getAllAttDetail();
		if (ld.isEmpty()) {
			return new ResponseEntity<List<AllDetail>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<AllDetail>>(ld,HttpStatus.OK);
	}
	
	@PostMapping("/createAtt")
	public AllDetail createAttDetail(@RequestBody AllDetail attDetail) {
		attDetailService.createAttDetail(attDetail);
		return attDetail;
	}
}
