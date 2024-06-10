package _07_Observer;

public class ObserverB implements Observer {

	@Override
	public void update() {
		System.out.println("ObserverB에게 이벤트 알림이 왔습니다");
	}

	@Override
	public String toString() {
		return "ObserverB";
	}
}
