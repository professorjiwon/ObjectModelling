package _05_BuilderPattern.builder;

public class SubwayBuilder {
	// 1. 멤버변수를 동일하게 넣어줌
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	
	// 2. 속성의 setter메소드 구현
	//	  - 반환형 : 내객체
	/*
	 * 메서드명 지정하는 방법
	   1) 속성명 : setter메소드와 구분을 위해 -> size(int size)
	   2) set속성명 -> setSize(int size)
	   3) with속성명 : setter메소드와 구분을 위해 'with'라는 키워드 사용 -> withSize(int size)
	 */

	public SubwayBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public SubwayBuilder setBread(String bread) {
		this.bread = bread;
		return this;
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
	public SubwayBuilder setSource(String source) {
		this.source = source;
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
