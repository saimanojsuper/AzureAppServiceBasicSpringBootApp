package com.azureappservice.appservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PricingController {
	protected static final Logger log = LoggerFactory.getLogger(PricingController.class);

	@GetMapping(value = "/azureappservice")

	public ResponseEntity<?> getPricingForScreen1() {
		ResponseEntity<String> response = new ResponseEntity<String>("checking app service adding a commit", HttpStatus.ACCEPTED);

		return response;

	}

}
