package _04_BuilderPattern.constructor;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	
	public Subway() { }
	
	public Subway(int size) {
		this.size = size;
	}

	public Subway(int size, String bread) {
		this.size = size;
		this.bread = bread;
	}

	public Subway(int size, String bread, String cheese) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
	}

	public Subway(int size, String bread, String cheese, String extraTopping) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
	}

	public Subway(int size, String bread, String cheese, String extraTopping, boolean vagetable) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vagetable = vagetable;
	}

	public Subway(int size, String bread, String cheese, String extraTopping, boolean vagetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vagetable = vagetable;
		this.source = source;
	}

	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", vagetable=" + vagetable + ", source=" + source + "]";
	}
}
