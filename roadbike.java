
public class roadbike extends Bicycle {
	
	private String saddle;
	
	public roadbike(int brake, int speed, int wheels, String pedal, String saddle) {
		super(brake, speed, wheels, pedal);
		this.saddle = saddle;
	}

    public String getSaddle() {
		return saddle;
	}


	public void setSaddle(String saddle) {
		this.saddle = saddle;
	}

}
