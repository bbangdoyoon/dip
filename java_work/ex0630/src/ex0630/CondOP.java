package ex0630;

/* 두 개의 수를 선언하고
/* 두 수 중에 큰 수를  삼항연산자 출력하고
 * 두수의 차를 절대값...
 * 자동정렬 ctrl + shift + f
 * 들여쓰기 tab
 */

public class CondOP {
	
	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		int result = 0;
		
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		
		if (num1 > num2) {
			 result = num1;
		}
		else {
			 result = num2;
		}
		System.out.println("result =" + result);
		
//		int result = num1>num2? num1:num2;
//		System.out.println("result = "+ result);
//		// num1, num2 비교해서 true면 num1이 result, false면 num2가 result
//		
//		result = num1 > num2 ? num1-num2 : num2-num1;
//		System.out.println("result = " +result);
		
		if (num1 > num2) {
		    result = num1-num2;
		}
		else{
			result = num1-num2;
		}

		
		
	}
	
	
}
