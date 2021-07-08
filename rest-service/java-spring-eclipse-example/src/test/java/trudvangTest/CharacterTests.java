package trudvangTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import characterEssentials.TrudvangCharacter;

public class CharacterTests {

	@Test
	void createCharacterTest() {
		TrudvangCharacter newCharacter = new TrudvangCharacter();
		newCharacter.setName("Kalle");
		Map<String, Integer> testStats = newCharacter.getStatMap();
		List<String> testSkillList = newCharacter.getSkillList();
		List<String> skillList = new ArrayList<>();
		skillList.add("hyvla");
		testSkillList.add("hyvla");
		skillList.add("kampvana");
		testSkillList.add("kampvana");
		Assert.state(newCharacter.getName().equals("Kalle"), "The name should be Kalle, it is not");
		Assert.state(testStats.get("strength")==0, "Strength level is not set to 0 intially");
		Assert.state(newCharacter.getSkillList().equals(skillList), "The skill list is not the same");
	}

}
