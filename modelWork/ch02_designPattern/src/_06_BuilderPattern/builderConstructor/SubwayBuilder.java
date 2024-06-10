package _06_BuilderPattern.builderConstructor;

public class SubwayBuilder {
	// 1. 멤버변수를 동일하게 넣어줌
	private int size;
	private String bread;
	private String cheese="모짜렐라";
	private String extraTopping="없음";
	private boolean vagetable;
	private String source;
	
	public SubwayBuilder(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}
	
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public SubwayBuilder setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;
	}
	
	// 3. Subway객체를 생성하여 리턴 : Subway생성자 호출로
	public Subway build() {
		return new Subway(size,bread,cheese,extraTopping,vagetable,source);
	}
	
	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}
}
