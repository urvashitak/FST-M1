
public class Activity8 {

	static void exceptionTest(String s) throws CustomException {
        if(s == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(s);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Method call with correct input
			Activity8 ac= new Activity8();
			ac.exceptionTest("Will print to console");
            // Method call with incorrect input
			ac.exceptionTest(null); // Exception is thrown here
			ac.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }
	}