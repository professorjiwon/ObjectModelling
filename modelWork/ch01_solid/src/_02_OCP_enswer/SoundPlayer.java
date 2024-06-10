package _02_OCP_enswer;

public class SoundPlayer {
	private PlayInterface playInter;
	
	void setPlayInter(PlayInterface playInter) {
		this.playInter = playInter;
	}
	
	void play() {
		playInter.play();
	}
}
