
public class Test {
	public static void main(String[] args) {
		Mountainbike b = new Mountainbike(2, 1, 4, "DMR V8", "racing saddles");
		System.out.println(b.getSaddle());
		System.out.println(b.getPedal());
		System.out.println(b.getBrake());
		Tandembike t = new Tandembike(2, 2, 4, "VMC V8", "quick release skewer");
		System.out.println(t.getForks());
		System.out.println(t.getWheels());
		System.out.println(t.getSpeed());
		
		
	}

}
