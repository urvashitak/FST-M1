
public class Bicycle implements BicycleParts, BicycleOperation {
	
	
	public int gears;
	public int currentSpeed;

	
	 public Bicycle(int gears,int currentSpeed) {
		
		this.gears=gears;
		this.currentSpeed=currentSpeed;
		
	}
	public void applyBrake(int decrement) {
		currentSpeed -=decrement;
		System.out.println("currentspeed is "+currentSpeed);
		
		}
	
	public void speedup(int increment) {
		
		currentSpeed +=increment;
		System.out.println("currentspeed is "+currentSpeed);
		
		
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
	@Override
	public void speedUp(int increment) {
	
	}

}