package GameEssentials;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.characterEssentials.TrudvangCharacter;

public class TrudvangSession {

	private String sessionName; 
	private List<TrudvangCharacter> activeCharacterList;
	private LocalTime lastUpdatedState;
	private LocalTime sessionCreated;
	
	public TrudvangSession(){
		setSessionName("");
		setActiveCharacterList(new ArrayList<>());
		LocalTime initialTime = LocalTime.now();
		setLastUpdatedState(initialTime);
		sessionCreated = initialTime;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public List<TrudvangCharacter> getActiveCharacterList() {
		return activeCharacterList;
	}

	public void setActiveCharacterList(List<TrudvangCharacter> activeCharacterList) {
		this.activeCharacterList = activeCharacterList;
	}

	public LocalTime getLastUpdatedState() {
		return lastUpdatedState;
	}

	public void setLastUpdatedState(LocalTime lastUpdatedState) {
		this.lastUpdatedState = lastUpdatedState;
	}

	public LocalTime getSessionCreated() {
		return sessionCreated;
	}
	
	
	
	
}
