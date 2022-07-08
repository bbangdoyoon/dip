package ex0708;

public class Ex02 {
	
	public static int a = 10;
	Ex02(){
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();  //객체 생성, a = 10 출력
		ex02.a++;                // 10 + a++로 11 출력
		Ex02 ex02_1 = new Ex02();//객체 생성 
		ex02_1.a++;              // 11 + a++로 12
		
		System.out.println("Ex02.a = " +Ex02.a);
		
	}

}
