/**
 * 
 */
package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.model.ProfileIntro;
import com.profile.repository.ProfileRepository;

/**
 * @author HP
 *
 */
@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	ProfileRepository repo;
	
	@Override
	public ProfileIntro getProfileIntro() {
		// TODO Auto-generated method stub
		return repo.getProfileIntro();
	}

}
