package ex0705;

public class Triangle {

	int base;
	int height;
	
	public Triangle() {}
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void printlnTriangle() {
		System.out.println("넓이 = "+ (base*height/2));
		
	}
}
