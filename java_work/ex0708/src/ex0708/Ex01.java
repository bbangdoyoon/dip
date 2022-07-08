package ex0708;

// 메모리는 heap영역과 static영역이있다.
// heap은  메모리 할당, 헤제를 한다 new()라는 예약어가 필요하다.
// static은 프로그램 시작하자마자 메모리에 항상 상주한다.

class A{
	static int a = 0;
	int b = 10;
	A(){
		a++;
		System.out.println("a = " +a);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A a1 = new A(); //static 영역의 a 로 이동, a= 0이 a++으로 1 출력
		A a2 = new A(); //static 영역의 a 로 이동, a= 1이 a++으로 2 출력
		A a3 = new A(); //static 영역의 a 로 이동, a= 2이 a++으로 3 출력
		
		System.out.println("A,a");
		//System.out.println(A,b); 이렇게는 접근불가
		System.out.println("a1,b");  //a1이라는 참조변수 사용
	
	}

}
