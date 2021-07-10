package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.example.demo.ExampleController;
import com.example.demo.JavaSpringEclipseExampleApplication;

import org.assertj.core.api.Assertions;

import characterEssentials.TrudvangCharacter;
import status.CharacterList;
import status.NonStaticCharacterList;

//@RunWith(SpringRunner.class)
//@WebMvcTest(JavaSpringEclipseExampleApplication.class)


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TrudvangControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
//	 @Test
//	 	public void createCharacterWithName() throws Exception {
//	    	
//	    String testName = "David";
//	    String testCall = "/add-character/" + testName; 
//	    mvc.perform(get(testCall));
//	    TrudvangCharacter newCharacter = CharacterList.getInstance().getCharacter(testName);
//	    Assert.state(newCharacter.getName().equals(testName), "The new character does not has the same name as the call");
//	    	
//	    }
	 
	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/example/",
				String.class)).contains("Hello, World");
		}
	
	@Test
	public void createCharacterWithName() throws Exception {
		String testName = "David";
	    String testCall = "/add-character/" + testName; 
//		this.restTemplate. 
	 }
	    
}
