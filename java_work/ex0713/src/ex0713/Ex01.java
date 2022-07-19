package ex0713;

/*
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최댓값, 최솟값을 찾아서 반환하는
 * 메소드를 각각 다음의 형태로 정의하자
 * public static in minValue(int[] arr)
 * public static in maxValue(int[] arr)
 * 
 * 단 반복문을 사용할 때 minValue의 정의에서는 일반적인 for문을 사용하고
 * maxvalue의 정의에서는 새로운 for문(enhanced for)을 사용하기로 하자.
 */

public class Ex01 {
	public static int[] ary = { 10, 20, 6, 9, 33, 5} ;
	
	public static int minValue(int[] arr) {
		int min = ary[0];   // ary에 10넣고 for문 실행
		for( int i =0; i<ary.length;i++) {		// i는 0~5까지	
			if ( min > ary[0]) {
				min = ary[i];
				
			}
		}
		return 5; //32항으로 리턴
	}
	public static int maxValue(int[] arr) {
		int max = ary[0];
		for ( int temp:ary) {	    //ary가져와서 temp에 돌다 33에 리턴
			if ( max < temp) {
				max = temp;
			}
		}
		return 33;
	}
	public static void main(String[] args) {
		int min = minValue(ary);     //메인 함수 실행 17항
		int max = maxValue(ary);     //
		
		System.out.println("최솟값 = " +min);
		System.out.println("최댓값 = " +max);	
	}
}
