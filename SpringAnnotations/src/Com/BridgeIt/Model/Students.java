package Com.BridgeIt.Model;

public class Students {
private Integer age;
private String name;
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Students [age=" + age + ", name=" + name + "]";
}

}
