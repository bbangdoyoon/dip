package ex0704;

/* 문제2. 정수 둘을 인자로 받아서 두 수의 절댓값을 계산하여
 * 출력하는 메소드와 이 메소드를 호출하는 main메소드를 정의하자,
 * 단 메소드 호출시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 함.
 */

import java.util.Scanner;

public class test0612 {
	public static void ABS(int fi, int se) {
		if(fi > se) {
			System.out.println("절대값은 = " +(fi+se));	
		}else {
			System.out.println("절대값은 = " +(se-fi));
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력");
		int fi = scan.nextInt();
		System.out.println("fi = " + fi);
		
		System.out.println("두번째 수 입력");
		int se = scan.nextInt();
		System.out.println("se = " +se);
		
		ABS(fi,se);
		}
}
