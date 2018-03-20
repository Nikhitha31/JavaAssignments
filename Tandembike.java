
public class Tandembike extends Bicycle {
	
	private String forks;
    
	public String getForks() {
		return forks;
	}

    public void setForks(String forks) {
		this.forks = forks;
	}

    public Tandembike(int brake, int speed, int wheels, String pedal, String forks) {
		super(brake, speed, wheels, pedal);
		this.forks = forks;
	}

	

}
