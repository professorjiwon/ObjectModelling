package _06_dip_ex;

public class Pet {
	Dog dog;
	Cat cat;

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Dog getDog() {
		return dog;
	}
	public Cat getCat() {
		return cat;
	}
}
