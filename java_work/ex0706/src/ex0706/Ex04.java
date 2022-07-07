package ex0706;

class Circle{
	private int rad;  //private는 같은 클래스내에서 변경이 가능하다
	final double PI = 3.14;
	public void pirntArea() {
		System.out.println("넓이는 = " +PI*rad*rad);
	}
	// alt + shift + S ->r - > alt A - > alt R
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		if (rad < 0) {
			System.out.println("반지름은 음수가 없습니다.");
			return;
		}
		this.rad = rad;
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Circle c1 = new Circle();   //객체 생성,  13줄의 int rad에 10대입
		c1.setRad(10);
//		c1.rad = 10;
	}
}
// private에서는 set~, get~ 사용