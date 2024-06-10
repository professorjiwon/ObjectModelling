package _06_BuilderPattern.builderConstructor;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(15,"허니오트","올리브오일")
				.setCheese("모짜렐라")
				.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(30,"화이트","머스터드")
				.setExtraTopping("아보카도")
				.build();
		System.out.println(menu2);
		
		SubwayBuilder sb = new SubwayBuilder(30,"화이트","머스터드")
				.setCheese("모짜렐라");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("추가토핑을 선택하세요 : ");
		String topping = sc.nextLine();
		
		Subway menu3 = sb
				.setExtraTopping(topping)
				.build();
		System.out.println(menu3);
	}
}