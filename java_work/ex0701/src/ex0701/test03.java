package ex0701;

public class test03 {
/*문제3. 1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고,
 * 그 수들의 합을 구해서 출력하는 프로그램을 while문을 이용해 작성
 */
	
	
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num<1001) {
			if(num %2 == 0 && num%7 == 0) {
				System.out.println("num = "+num);
				sum = sum + sum;
				
			}
			num+=1;    

		}
		System.out.println("sum = "+ sum);
	}

}
