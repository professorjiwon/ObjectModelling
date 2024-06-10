package _04_BuilderPattern.constructor;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway(15, "화이트", "슈레드");
		System.out.println(menu1);
		
		// 매개변수가 너무 많으면 순서도 햇갈리고, 중간에 안넣을려면 초기화를 넣어줘야함
		Subway menu2 = new Subway(30, "하티", null, null, true, "머스타드");
		System.out.println(menu2);
	}
}