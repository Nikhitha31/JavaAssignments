
public class Bicycle {
	
	private int brake;
	 private int speed;
	 private int wheels;
	 private String pedal;
	 
	 public Bicycle(int brake, int speed, int wheels, String pedal) {
		 this.brake = brake;
		 this.speed = speed;
		 this.wheels = wheels;
		 this.pedal = pedal;
		 
		}
	 
	 public String getPedal() {
		return pedal;
	}

	public void setPedal(String pedal) {
		this.pedal = pedal;
	}

	
	
	public int getBrake() {
		return brake;
	}

	public void setBrake(int brake) {
		this.brake = brake;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	

}
