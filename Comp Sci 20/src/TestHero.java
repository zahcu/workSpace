
public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero Hero1 = new hero();
		hero Hero2 = new hero("Explosion", "Katsuki Bakugo", 16);
		hero Hero3 = new hero("Half Cold and Half Hot", " Shoto Todoroki", 16);
		
		System.out.println(Hero1.toString());
		System.out.println(Hero2.toString());
		System.out.println(Hero3.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(Hero1);
		m.mutate(Hero2);
		m.mutate(Hero3);
		
	}

}
