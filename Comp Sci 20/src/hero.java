
public class hero {
private String power;//variables, attributes
private String name;
private int age;
private int health;
private int damage;

public hero() {//constructor
	
	power = "One for All";
	name = "Midoriya Izuku";
	age = 15;
	health = 100;
	damage = 10;
	

}
	public hero(String power, String name, int age, int health, int damage) {//constructor
		this.power = power;
		this.name = name;
		this.age = age;
		this.health = health;
		this.damage = damage;
		
	}
	

public void setPower(String power) {//setter
	this.power = power;
}

public int getHealth() {
	return health;
}

public int getDamage() {
	return damage;
}

public void setHealth(int health) {
	this.health = health;
}

public void fight(hero h) {
	h.setHealth(h.getHealth() - this.damage);
}

public String toString() {//convert to string
	return "\nName: " + name + "\nPower: " + power + "\nAge: " + age + "\nHP: " + health + "\nDMG: " + damage;
	}
}
