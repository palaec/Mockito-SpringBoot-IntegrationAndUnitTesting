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
	
	
	@Test
	void getInterestTest() {
		Assert.assertEquals("120.00", profileService.getInterest("1000.00" ,"6.0" , "2").toString());
	}
	
	@Test
	void getSavingsTest() {
		Assert.assertEquals(19.96, profileService.getSavings(80.20 , 100.20), 0.00007984031936);
	}

	
	@Test
	void getSavingsUsingBigDecimalTest() {
		Assert.assertEquals("19.96", profileService.getSavingsUsingBigDecimal(80.20 , 100.20).toString());
	}
}
