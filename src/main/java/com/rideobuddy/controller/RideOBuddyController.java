package com.rideobuddy.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rideobuddy.configurations.RideOBuddyConstants;

@RestController
public class RideOBuddyController {
	@RequestMapping(path = RideOBuddyConstants.PATH + "{" + RideOBuddyConstants.RIDER + "}", method = RequestMethod.GET)
	public ResponseEntity riderDetails (@PathParam(value = RideOBuddyConstants.RIDER) String rider) {
		getWelcomeRider();
		return ResponseEntity.ok(getWelcomeRider());
	}
	
	public String getWelcomeRider () {
		return "Hi Rider";
	}

}
