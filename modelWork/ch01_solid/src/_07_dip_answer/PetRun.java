package _07_dip_answer;

public class PetRun {

	public static void main(String[] args) {
		Pet pet = new Pet();
		
		pet.setPet(new Cat());
		System.out.println(pet.getPet());
		
		pet.setPet(new Dog());
		System.out.println(pet.getPet());
		
		pet.setPet(new Hamster());
		System.out.println(pet.getPet());
	}
}
