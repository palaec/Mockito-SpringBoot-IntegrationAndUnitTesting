/**
 * 
 */
package com.profile.repository;

import org.springframework.stereotype.Repository;

import com.profile.model.ProfileIntro;

/**
 * @author Arghya
 *
 */
@Repository
public class ProfileRepository {

	public ProfileIntro getProfileIntro() {
		// TODO Auto-generated method stub
		return new ProfileIntro("Arghya" ,"SoftwareEngg", "MyProfile" ,"Munich","palaec@gmail.com" );
	}

}
