package com.bridgelabz.spring.autowiring.model;

public class Language {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Language [name=" + name + "]";
}

}
