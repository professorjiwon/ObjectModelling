package _05_BuilderPattern.builder;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder()
				.setBread("허니오트")
				.setSize(15)
				.setCheese("모짜렐라")
				.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder()
				.setBread("화이트")
				.setExtraTopping("아보카도")
				.build();
		System.out.println(menu2);
	}
}