package _03_BuilderPattern.ex;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway();
		menu1.setSize(15);
		menu1.setBread("통밀");
		menu1.setCheese("모짜렐라");
		menu1.setSource("핫칠리");
		menu1.setExtraTopping("베이컨");
		menu1.setVagetable(true);
		System.out.println(menu1);
		
		Subway menu2 = new Subway();
		menu2.setSource("칠리");
		menu2.setExtraTopping("아보카도");
		System.out.println(menu2);
	}
}
