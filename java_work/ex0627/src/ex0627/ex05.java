package ex0627;

public class ex05 {
	
	public static void main(String[] args) {
		
		int num1 = -10;
		
//		 -10일 경우 첫 번째 if가 성립하기에 뒤는 생략
		if ( num1 < 0)
			System.out.println("num1 < 0 true");
		
		else if (num1 < 100)
			System.out.println("num1 < 100 true");
		
		else
			System.out.println("num1 은 100이상");
	}

}
