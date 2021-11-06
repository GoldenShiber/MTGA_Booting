package com.example.status;

import java.util.HashMap;

import GameEssentials.TrudvangSession;

public class SessionList {
	
	private static SessionList instance = null; 
	private HashMap<String, TrudvangSession> sessionMap;
	
	private SessionList(){
		super();
		sessionMap = new HashMap<>();
	}
	
	public static SessionList getInstance() {
		if(instance == null) {
			instance = new SessionList();
		}
		return instance;
	}
	
	public TrudvangSession getSession(String sessionName) {
		return sessionMap.get(sessionName);
	}
	
	public void addSession(String sessionName) {
		TrudvangSession newSession = new TrudvangSession();
		newSession.setSessionName(sessionName);
		sessionMap.put(sessionName, newSession);
	}
	
	public void removeSession(String sessionName) {
		sessionMap.remove(sessionName);
	}
	
	public HashMap<String, TrudvangSession> getSessionMap() {
		return sessionMap;
	}
	
	public void resetSessionMap() {
		sessionMap.clear();
	}
}
