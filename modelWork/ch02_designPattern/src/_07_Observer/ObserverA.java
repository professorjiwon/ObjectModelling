package _07_Observer;

public class ObserverA implements Observer {

	@Override
	public void update() {
		System.out.println("ObserverA에게 이벤트 알림이 왔습니다");
	}

	@Override
	public String toString() {
		return "ObserverA";
	}
}
