package com.example.status;

import java.util.HashMap;

import com.example.characterEssentials.TrudvangCharacter;

public class NonStaticCharacterList {

//	private static NonStaticCharacterList instance = null;
	private HashMap<String, TrudvangCharacter> characterList = new HashMap<>();

	private NonStaticCharacterList() {
		super();
	}
	
//	public static NonStaticCharacterList getInstance() {
//		if(instance == null) {
//			instance = new NonStaticCharacterList();
//		}
//		return instance;
//	}
	
	public void addCharacter(TrudvangCharacter character) {
		characterList.put(character.getName(), character);
	}
	
	public TrudvangCharacter getCharacter(String name) {
		return characterList.get(name);
	}
	
	public void removeCharacter(String name) {
		characterList.remove(name);
	}
	
	public HashMap<String, TrudvangCharacter> getCharacterList(){
		return characterList;
	}
	
	public void cleanse() {
		characterList = new HashMap<>();
	}
	
	public String getCharList() {
		String nameList = ""; 
		for(TrudvangCharacter character : characterList.values()) {
			nameList += character.getName() + " ";
		}
		return nameList;
	}
	
}