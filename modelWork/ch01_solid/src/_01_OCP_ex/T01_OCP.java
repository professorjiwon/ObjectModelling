package _01_OCP_ex;

class SoundPlayer {
	void play() {
		System.out.println("play wav");
	}
}

public class T01_OCP {
	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		sp.play();
	}
}
