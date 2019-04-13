package model;

import Com.BridgeIt.AutowiringModel.Ability;

public class Person {
private Ability ability;

public Ability getAbility() {
	return ability;
}

public void setAbility(Ability ability) {
	this.ability = ability;
}
@Override
public String toString() {
	return "Person [ability=" + ability + "]";
}
public void displayAbility() {
	System.out.println("Abilityofperson"+ability);
}
}
