package _07_Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	// 감시자를 담을 리스트
	List<Observer> observers = new ArrayList<>();
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println(o + " 구독 완료");
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		System.out.println(o + " 구독 취소");
	}

	// 감시자에게 이벤트 송신
	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update();		// 위임
		}
	}
}
