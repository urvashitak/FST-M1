
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sec = 1000000000;

		double EarthSec = 31557600;
		double Mercury = 0.2408467;
		double Venus = 0.61519726;
		double Mars = 1.8808158;
		double Jupiter = 11.862615;
		double Saturn = 29.447498;
		double Uranus = 84.016846;
		double Neptune = 164.79132;
		double Calcsec= sec / EarthSec;
		
		System.out.println("Age on Mercury in seconds: " + Calcsec / Mercury);
	//	System.out.println("Age on Mercury: " + sec / EarthSec  / Mercury);
        System.out.println("Age on Venus in seconds: " + Calcsec / Venus);
        System.out.println("Age on Earth in seconds: " + Calcsec / EarthSec);
        System.out.println("Age on Mars in seconds: " + Calcsec / Mars);
        System.out.println("Age on Jupiter in seconds: " + Calcsec / Jupiter);
        System.out.println("Age on Saturn in seconds: " + Calcsec / Saturn);
        System.out.println("Age on Uranus in seconds: " + Calcsec / Uranus);
        System.out.println("Age on Neptune in seconds: " + Calcsec / Neptune);
	}
	

}
