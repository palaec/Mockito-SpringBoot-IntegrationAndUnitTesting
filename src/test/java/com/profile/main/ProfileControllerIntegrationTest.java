package com.profile.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.profile.model.ProfileIntro;

import org.junit.Assert;



@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = MyProfileApplication.class
		)
@AutoConfigureMockMvc //it will automatically create the mockmvc and it will allow to use the @Autowired MockMvc in this test
public class ProfileControllerIntegrationTest {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void getProfileIntro_Test() throws Exception{
		MvcResult mvcResult = mockMvc.perform(
				MockMvcRequestBuilders.get("/getProfileIntro"))
				.andReturn();		
		String contentAsString = mvcResult.getResponse().getContentAsString();
		ProfileIntro response = objectMapper.readValue(contentAsString, ProfileIntro.class);		
		Assert.assertEquals("Arghya", response.getName());		
	}
	
}
