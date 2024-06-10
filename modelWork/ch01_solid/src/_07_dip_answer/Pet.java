package _07_dip_answer;

public class Pet {
	IPet ipet;

	public void setPet(IPet ipet) {
		this.ipet = ipet;
	}

	public IPet getPet() {
		return ipet;
	}
}
