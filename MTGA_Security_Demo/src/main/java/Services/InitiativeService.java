package Services;

import java.util.List;

import com.example.characterEssentials.TrudvangCharacter;

import GameEssentials.Dice;

public class InitiativeService {
	
	private Dice initiativeDice = new Dice(10);

	public void updateInitiative(TrudvangCharacter trudvangCharacter) {
		trudvangCharacter.getStatMap()
		.put("initiative", initiativeDice.roll() + trudvangCharacter.getStatMap().get("initiativeModifier"));
	}
	
	public void updateInitiative(List<TrudvangCharacter> characterList) {
		for (TrudvangCharacter trudvangCharacter : characterList) {
			updateInitiative(trudvangCharacter);
		}
	}
}
