package _04_isp_ex;

public class CarRun {
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.drive();
		sedan.patientTransport();
		sedan.water();
		System.out.println("---------------");
		
		FireEngine fire = new FireEngine();
		fire.drive();
		fire.patientTransport();
		fire.water();
		System.out.println("---------------");
		
		Ambulance am = new Ambulance();
		am.drive();
		am.patientTransport();
		am.water();

	}
}
