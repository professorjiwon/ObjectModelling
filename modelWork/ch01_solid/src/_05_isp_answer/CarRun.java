package _05_isp_answer;

public class CarRun {
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.drive();
		System.out.println("---------------");
		
		FireEngine fire = new FireEngine();
		fire.drive();
		fire.water();
		System.out.println("---------------");
		
		Ambulance am = new Ambulance();
		am.drive();
		am.patientTransport();
	}
}
