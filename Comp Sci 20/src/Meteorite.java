
public class Meteorite {

	String[] powers = {"Quirkless"};
	
	public Meteorite() {}
	
	public void mutate(hero h) {
		int r = (int)(Math.random() * powers.length);
		String newPower = powers[r];
		h.setPower(newPower);;
		System.out.println(h.toString());
	}
}
