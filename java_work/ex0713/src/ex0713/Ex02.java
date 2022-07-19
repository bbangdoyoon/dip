package ex0713;

class A{
	int a = 10;
	public void doA() {
		System.out.println("doA");
	}
}

class B extends A{ // B라는 클래스라 A클래스를 상속받음 B 안에 doB(), A가 있고 A안에 a= 10, doA포함
	public void doB() {
		super.doA();
		System.out.println("doB a = "+ super.a);
	}
}
public class Ex02 {
	
	public static void main(String[] args) {
		B b = new B();
		b.doB();
	}

}
