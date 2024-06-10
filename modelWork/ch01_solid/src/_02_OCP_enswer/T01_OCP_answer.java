package _02_OCP_enswer;

public class T01_OCP_answer {
	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInter(new Wav());
		System.out.print("wav파일 재생 : ");
		sp.play();
		
		sp.setPlayInter(new Mp3());
		System.out.print("mp3파일 재생 : ");
		sp.play();
		
		sp.setPlayInter(new Ogg());
		System.out.print("ogg파일 재생 : ");
		sp.play();
	}
}
