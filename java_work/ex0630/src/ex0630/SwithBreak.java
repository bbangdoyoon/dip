package ex0630;

public class SwithBreak {
	
	public static void main(String[] args) {
		
		int n = 3;
		/*
		switch (n) {
		case 1 :
			System.out.println("Simple java");
			break;
			
		case 2 :
			System.out.println("Funny java");
			break;
			
		case 3 :
			System.out.println("Fantastic java");
			break;
//			break가 없다면 다음 실행
		default :
			System.out.println("The best programming Laguage");
			break;
		}
		*/
		if (n==1) {
			System.out.println("Simple java");
		}
		else if (n == 2) {
			System.out.println("Funny java");
		}
		else if (n == 3) {
			System.out.println("Fantastic java");
		}
		else {
			System.out.println("The best programming Laguage");
		}
		System.out.println("Do you like java");		
	}
	

}
