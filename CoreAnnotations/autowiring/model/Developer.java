package com.bridgelabz.spring.autowiring.model;

public class Developer {
private Language language;
public Developer(Language language) {
	this.language=language;
}
public Language getLanguage() {
	return language;
}
public void setLanguage(Language language) {
	this.language = language;
}

public void display() {
	System.out.println("Developer language"+language);
}
@Override
public String toString() {
	return "Developer [language=" + language + "]";
}

}
