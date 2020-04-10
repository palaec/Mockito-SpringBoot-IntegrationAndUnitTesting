package com.profile.main;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.profile.model.ProfileIntro;
import com.profile.repository.ProfileRepository;
import com.profile.service.ProfileService;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyProfileApplicationTests {
	
	@Autowired
	ProfileService profileService;
	
	@MockBean
	ProfileRepository profileRepository;

	@Test
	void contextLoads() {
		when(profileRepository.getProfileIntro()).thenReturn(new ProfileIntro("Arghya" ,"SoftwareEngg", "MyProfile" ,"Munich","palaec@gmail.com" ));
		Assert.assertEquals("Arghya", profileService.getProfileIntro().getName());
	}

}
