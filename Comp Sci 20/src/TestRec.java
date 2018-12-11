
public class TestRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec r1 = new rec();
		rec r2 = new rec(5, 5, 25, 50);
		
		r2.translate(5,20);
		System.out.println(r1.getX());
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
