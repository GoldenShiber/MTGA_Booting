package com.example.characterEssentials;

import java.util.HashMap;

import com.example.stats.CombatAbilites;

public class TrudvangBuilderCharacter {

	// All final attributes
	
	// Required
	private final String name; // Required
	private final String race; // Required
	private final int stamina; // Required
	private final int intelligence; // Required
	private final int charisma; // Required
	private final int perception; // Required
	private final int willpower; // Required
	private final int agility; // Required
	
	// Optional
	private final int age; // Optional
	private final int raud; // Optional
	private final String description;
	
	// Values derived from stats
	private int initiative; // Optional
	private int initiativeModifier; // Optional
	private int maxHealth; 
	private int currentHealth;
	
	private TrudvangBuilderCharacter(CharacterBuilder builder) {
		this.name = builder.name;
		this.race = builder.race;
		this.stamina = builder.stamina;
		this.intelligence = builder.intelligence;
		this.charisma = builder.charisma;
		this.perception = builder.perception;
		this.willpower = builder.willpower;
		this.agility = builder.agility;
		this.age = builder.age;
		this.raud = builder.raud;
		this.description = builder.description;
	}
	
	//All getter, and NO setter to provde immutability
	public String getName() {
		return name; 
	}
	
	public String getRace() {
		return race; 
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public int getCharisma() {
		return charisma;
	}
	
	public int getPerception() {
		return perception;
	}
	
	public int getWillpower() {
		return willpower;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRaud() {
		return raud;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static class CharacterBuilder{
		
		private final String name; 
		private final String race;
		private final int stamina; 
		private final int intelligence; 
		private final int charisma; 
		private final int perception; 
		private final int willpower; 
		private final int agility; 
		
		private int age; 
		private int raud; 
		private String description;
		
		private CharacterBuilder(String name, String race, int stamina, int intelligence, int charisma, int perception, int willpower, int agility) {
			this.name = name;
			this.race = race;
			this.stamina = stamina;
			this.intelligence = intelligence;
			this.charisma = charisma;
			this.perception = perception;
			this.willpower = willpower;
			this.agility = willpower;
		}
		
		public CharacterBuilder age(int age) {
			this.age = age;
			return this;
	}
		public CharacterBuilder raud(int raud) {
			this.raud = raud; 
			return this;
		}
		
		public CharacterBuilder description(String description) {
			this.description = description;
			return this;
		}
		
		public TrudvangBuilderCharacter build() {
			TrudvangBuilderCharacter trudVangCharacter = new TrudvangBuilderCharacter(this);
			validateCharacterObject(trudVangCharacter);
			return trudVangCharacter;
		}
		
		private void validateCharacterObject(TrudvangBuilderCharacter trudvangCharacter) {
            //Do some basic validations to check 
            //if user object does not break any assumption of system
        }
}
	
}
