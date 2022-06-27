package ex0627;

public class ex07 {
	
	public static void main(String[] args) {
		
		int n = 1;
//		n 값에 따라 실행, break를 만나면 break 만나기 직전 값만 실행 break가 없다면, 다음도 실행
		switch (n) {
		case 1: 
			System.out.println("n == 1");
			break;
		case 2: 
			System.out.println("n == 2");
			break;
		case 3: 
			System.out.println("n == 3");
			break;
//		break가 없을시, default 출력
		default:
			System.out.println("default");
			break;
		}
		System.out.println("끝");
	}

}
