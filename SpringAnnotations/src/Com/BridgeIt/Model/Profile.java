package Com.BridgeIt.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("student2")
	
	
private Students students;


public Profile() {
	System.out.println("INSIDE PROFILE CONSTRUCTOR");
}
public void printAge() {
	System.out.println("Age: "+students.getAge());
	
}

public void printName() {
	System.out.println("Name: "+students.getName());
}

}
