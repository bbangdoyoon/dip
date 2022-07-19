package ex0711;

public class Ex03 {
	
	public Ex03() {
		System.out.println("기본생성자");
	}
	public Ex03(int a) {
		System.out.println("파라메타 1개 = " +a);
	}
	public Ex03(int a, int b) {
		System.out.println("파라메타 2개 = " +a);
		System.out.println("파라메타 2개 = " +b);
	}
	public static void main(String[] args) {  //메인 함수를 가장 먼저 찾아서 가장 먼저 실행
		new Ex03();         // 참조하는게 없기 때문에 메모리 상에서 소멸, 출력은 한다
		new Ex03(10);       // int a 호출
		new Ex03(10,20);    // int a int b 호출
	}
}
