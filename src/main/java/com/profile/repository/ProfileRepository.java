/**
 * 
 */
package com.profile.repository;

import java.util.Optional;

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

	public Object findByBusNumber(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<ProfileIntro> findProfileByEmail(String string) {
		// TODO Auto-generated method stub
		System.out.println("Hellloooooo");
		return Optional.of(new ProfileIntro("Arghya" ,"SoftwareEngg", "MyProfile" ,"Munich","palaec@gmail.com" ));
	}

	public int findSalaryByName(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
