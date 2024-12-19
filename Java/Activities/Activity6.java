
public class Activity6 {

	    public static void main(String[] args) throws InterruptedException {
	        //There is a plane with max 10 passengers
	        Plane plane = new Plane(10);
	        //Add passengers on the list
	        plane.onboard("Ram");
	        plane.onboard("Sita");
	        plane.onboard("Lakhsman");
	        
	        System.out.println(" took off: " + plane.takeOff());
	       
	        System.out.println("People on plane: " + plane.getPassengers());
	        
	        Thread.sleep(5000);
	    
	        plane.land();
	        //Plane lands
	        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
	        System.out.println(" after landing: " + plane.getPassengers());
	    }
}
