package ex0706;

class Triangle {
	int width;
	int height;
	public Triangle() {}
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	// alt + shift + S - > O생성자
	// alt + shift + s - > r getter setter만들기	
    public void printArea() {
		double area = this.width * height * 0.5d;
		System.out.println("넓이는 = " + area);
	}		
	public void setwidth(int w) {
		width = w;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.printArea();
		t1.setHeight(50);
		t1.setwidth(50);
		t1.printArea();
		
		Triangle t2 = new Triangle(30,50);
		t2.printArea();
	}
}
