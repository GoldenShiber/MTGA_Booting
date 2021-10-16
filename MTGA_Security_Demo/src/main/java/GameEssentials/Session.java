package GameEssentials;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.characterEssentials.TrudvangCharacter;

public class Session {

	private String sessionName; 
	private List<TrudvangCharacter> activeCharacterList;
	private LocalTime lastUpdatedState;
	private LocalTime sessionCreated;
	
	Session(){
		sessionName = "";
		activeCharacterList = new ArrayList<>();
		LocalTime initialTime = LocalTime.now();
		lastUpdatedState = initialTime;
		sessionCreated = initialTime;
		
	}
	
	
	
}
