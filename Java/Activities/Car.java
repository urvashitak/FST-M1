
public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	Car(){
		tyres=4;
		doors=4;
	}
	void displayCharacteristics(){
		System.out.println(color);
		System.out.println(transmission);
		System.out.println(make);
		System.out.println(tyres);
		System.out.println(doors);
	}
	void accelarate(){
		System.out.println("Car is moving forward.");
	}
	void brake(){
		System.out.println("Car has stopped.");
	}	
}
