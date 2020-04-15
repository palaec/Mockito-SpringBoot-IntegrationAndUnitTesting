/**
 * 
 */
package com.profile.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping(path = "/getInterest/{principle}/{rate}/{time}")
	 ResponseEntity<String> getInterest(@PathVariable(value = "principle") String principle ,  @PathVariable(value = "rate") String rate , @PathVariable(value = "time") String time){	
		BigDecimal  interest = profileService.getInterest(principle,rate,time);
		return new ResponseEntity<>(interest.toString(), HttpStatus.OK);		
	}
	
	@GetMapping(path = "/getProfileFormat/{name}")
	 ResponseEntity<Object> getProfileFormat(@PathVariable(value = "name") String name ){	
		 String s = profileService.formatProfile(name);
		return new ResponseEntity<>(s, HttpStatus.OK);		
	}
	
}
