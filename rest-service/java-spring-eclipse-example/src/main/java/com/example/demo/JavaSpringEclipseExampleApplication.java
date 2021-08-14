package com.example.demo;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import status.CharacterList;
import util.JSONUtilities;

@SpringBootApplication
public class JavaSpringEclipseExampleApplication {

	public static void main(String[] args) {
		CharacterList.getInstance();
		JSONUtilities.importJSONFile("GUItest.json");
		SpringApplication.run(JavaSpringEclipseExampleApplication.class, args);
		
		// Add a backup saved, so we have one running each 30 min. 
		Timer timer = new Timer();

		timer.schedule( new TimerTask() {
		    public void run() {
		       JSONUtilities.saveCharacterList(CharacterList.getInstance().getCharacterList(), "GUItestBackup.json");
		    }
		 }, 0, 60*1000);
		
	}

}
