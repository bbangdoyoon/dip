package ex0624;

public class GG {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		
	
		System.out.println(num1 < num2 && num2 < num3);   // 앞이 true면, 뒤도 연산, 앞이 false면, 뒤는 연산 하지않는다
		System.out.println(num1 > num2 && num2 < num3);
		
		System.out.println(!true);
		
		//System.out.println(num1 > num2 && );
	}
}
