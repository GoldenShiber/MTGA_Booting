package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.characterEssentials.TrudvangCharacter;
import com.example.status.CharacterList;
import com.example.status.SessionList;

import GameEssentials.TrudvangSession;

@RestController
@RequestMapping("/api/session")
public class SessionController {
	
	@GetMapping("/create-session/{sessionName}")
	public void createSession(@PathVariable String sessionName) {
		SessionList.getInstance().addSession(sessionName);
	}

	@GetMapping("/remove-session/{sessionName}")
	public void removeSession(@PathVariable String sessionName) {
		SessionList.getInstance().removeSession(sessionName);
	}
	
	@GetMapping("/get-session/{sessionName}")
	public ResponseEntity<TrudvangSession> getSession(@PathVariable String sessionName) {
		TrudvangSession session = SessionList.getInstance().getSession(sessionName);
		if(session != null) {
			return ResponseEntity.ok(session);
		}
		return null;
	}
	
	// To do, add nice way of getting names of each session, with a "hack" loop operation.
	@GetMapping("/get-session-list")
	public ResponseEntity<String> getSessionList() {
		return ResponseEntity.ok(CharacterList.getInstance().getCharList());
	}
	
//	@GetMapping("/get-session-list")
//	public ResponseEntity<TrudvangSession> getSessionList(@PathVariable String sessionName) {
//		return SessionList.getInstance().getSession(sessionName);
//	}
	
}
