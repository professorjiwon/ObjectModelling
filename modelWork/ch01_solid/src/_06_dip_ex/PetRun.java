package _06_dip_ex;

public class PetRun {

	public static void main(String[] args) {
		Pet pet = new Pet();
		
		pet.setCat(new Cat());
		System.out.println(pet.getCat());
		
		pet.setDog(new Dog());
		System.out.println(pet.getDog());
	}
}
