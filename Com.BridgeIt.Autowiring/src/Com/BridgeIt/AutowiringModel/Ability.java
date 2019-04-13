package Com.BridgeIt.AutowiringModel;

public class Ability {
private String Skill;

public String getSkill() {
	return Skill;
}

public void setSkill(String skill) {
	Skill = skill;
}

@Override
public String toString() {
	return "Ability [Skill=" + Skill + "]";
}


}
