/**
 * 
 */
package com.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.model.ProfileIntro;
import com.profile.service.ProfileService;

/**
 * @author Arghya
 *
 */
@RestController
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	@GetMapping(path = "/getProfileIntro")
	 ResponseEntity<Object> getProfileIntro(){	
		ProfileIntro profileIntro = profileService.getProfileIntro();
		return new ResponseEntity<>(profileIntro, HttpStatus.OK);		
	}
	
}
