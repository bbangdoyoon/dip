package ex0705;

public class ex02 {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = a1;    
		//a1을 a2로 본다. 새로 생성하는것이 아니다. new라는 예약어가 들어가야 새로 생성
		
		a1.a +=10;
		System.out.println("a2.a = "+a2.a);//-----객체 참조형-----
		
		int a = 10;
		int b = a;
		
		a = 20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
