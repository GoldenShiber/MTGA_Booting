package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import characterEssentials.TrudvangCharacter;
import status.CharacterList;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/example")
public class ExampleController {
	
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@GetMapping("/hello-world")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello, World");
	}
	
	@GetMapping("/hello-mister/{name}")
	public ResponseEntity<String> get(@PathVariable String name) {
		return ResponseEntity.ok("Hello mr" +name+"!");
	}
	
	@GetMapping("/add-character/{name}")
	public void addCharacter(@PathVariable String name) {
		TrudvangCharacter newCharacter = new TrudvangCharacter();
		newCharacter.setName(name);
		CharacterList.getInstance().addCharacter(newCharacter);
	}
	
	@GetMapping("/get-characters")
	public ResponseEntity<String> getCharacters() {
		return ResponseEntity.ok(CharacterList.getInstance().getCharList());
	}
}
