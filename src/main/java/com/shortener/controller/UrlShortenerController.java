package com.shortener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shortener.service.UrlShortener;

@RestController
public class UrlShortenerController {
	
	@Autowired
	UrlShortener urlShortner;
	
	@RequestMapping(value = "/shorten", method = RequestMethod.POST)
	public String shortedUrl() {
		return null;
	}
	
	@RequestMapping(value = "/[id]", method = RequestMethod.GET)
	public void gotoUrl(String urlId) {
		
	}
}
