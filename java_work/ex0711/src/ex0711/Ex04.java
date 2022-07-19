package ex0711;

public class Ex04 {
	Ex04(){
		BB b1 = new BB();  // BB의 6항으로 기본생성자 호출
		
		System.out.println(b1.toString());
		//toString()생랴가능 b1만 적어도된다.
		System.out.println("abc".equals(new String("abc")));
		//문자열은 equals로 비교해야한다.
		System.out.println("abc" == new String("abc"));
		
		String a = 12+"";
		String b = String.valueOf(12);
		//String c = 12;  13항 처럼 하거나 14항 처럼 표현해야한다.
	}
	
	public static void main(String[] args) {
		new Ex04(); // 4항으로 
	}

}
