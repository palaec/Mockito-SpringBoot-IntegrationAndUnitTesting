package com.profile.main;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.profile.exception.NoProfileFoundException;
import com.profile.model.ProfileIntro;
import com.profile.repository.ProfileRepository;
import com.profile.service.ProfileServiceImpl;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class MyProfileApplicationTests {
	
	@Mock
	ProfileRepository profileRepository;
	
	@InjectMocks
	ProfileServiceImpl profileService;
	
	

	@Test
	void contextLoads() {
		when(profileRepository.getProfileIntro()).thenReturn(new ProfileIntro("Arghya123" ,"SoftwareEngg", "MyProfile" ,"Munich","palaec@gmail.com" ));
		Assert.assertEquals("Arghya123", profileService.getProfileIntro().getName());
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
	
	@Test
	public void test_formatProfile_noProfileException() {

		when(profileRepository.findProfileByEmail("palaec@gmail.com")).thenThrow(new NoProfileFoundException());		
		Exception exception = assertThrows(NoProfileFoundException.class, () -> {
			profileService.formatProfile("palaec@gmail.com");
	    });
		Assert.assertEquals("com.profile.exception.NoProfileFoundException",exception.toString());
	}	
	
	@Test
	public void test_parkBusToDepot_depotNotExists() {
		// TODO Auto-generated method stub
		ProfileIntro p= new ProfileIntro("Arghya1111" ,"SoftwareEngg", "MyProfile" ,"Munich","palaec@gmail.com" );
		when(profileRepository.findProfileByEmail("palaec@gmail.com")).thenReturn(Optional.of(p));
		when(profileRepository.findSalaryByName(p.getName())).thenReturn(100000);
		Assert.assertEquals("Arghya1111100000",profileService.formatProfile("palaec@gmail.com"));
		
	}	
	
}
