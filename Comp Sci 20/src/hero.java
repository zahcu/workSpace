
public class hero {
private String power;
private String name;
private int age;

public hero() {
	
	power = "One for All";
	name = "Midoriya Izuku";
	age = 15;
	
	
}
public void setPower(String power) {
	this.power = power;
}

	public hero(String power, String name, int age) {
		this.power = power;
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return "Name: " + name + " Power: " + power + " Age: " + age;
	}
}
