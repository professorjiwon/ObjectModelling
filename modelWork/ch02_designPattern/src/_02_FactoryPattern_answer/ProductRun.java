package _02_FactoryPattern_answer;

import java.util.Calendar;

public class ProductRun {

	public static void main(String[] args) {
		Product p1 = ProductFactory.getInstance("tv");
		System.out.println(p1);

		p1 = ProductFactory.getInstance("computer");
		System.out.println(p1);
		
		p1 = ProductFactory.getInstance("TV");
		System.out.println(p1);
		
		System.out.println(Calendar.getInstance().getClass());
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
	}
}
