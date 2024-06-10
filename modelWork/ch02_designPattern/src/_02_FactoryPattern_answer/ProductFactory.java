package _02_FactoryPattern_answer;

public class ProductFactory {

	public static Product getInstance(String name) {
		Product product = new Product();
		
		if(name.equalsIgnoreCase("tv")) {
			product.setName("Tv");
			product.setPrice(300);
		} else if(name.equalsIgnoreCase("computer")) {
			product.setName("Computer");
			product.setPrice(200);
		}
		return product;
	}
}
