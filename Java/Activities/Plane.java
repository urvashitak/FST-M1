import java.util.ArrayList;
import java.util.Date;
import java.util.List;

	class Plane {
	    private ArrayList<String> passengers;
	    private int maxPass;
	    private Date lastTimeTookOf;
	    private Date lastTimeLanded;

	    public Plane(int maxPass) {
	        this.maxPass = maxPass;
	        this.passengers = new ArrayList<>();
	    }

	    public void onboard(String passenger) {
	        this.passengers.add(passenger);
	    }

	    public Date takeOff() {
	        this.lastTimeTookOf = new Date();
	        return lastTimeTookOf;
	    }

	    public void land() {
	        this.lastTimeLanded = new Date();
	        this.passengers.clear();
	    }

	    public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	    public List<String> getPassengers() {
	        return passengers;
	    }
	}

