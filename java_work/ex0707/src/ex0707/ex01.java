package ex0707;

public class ex01 {
	
	public static void main(String[] args) {
		
		 person p1 = new person();
		 //p1.name = "자바";
		 p1.setName("자바");
		 System.out.println(p1);
		 //person이라는 객체 생성, 이름은 p1
		 System.out.println(p1.toString());
		 //위처럼 toString을 사용가능, 생략도 가능
		 
		 person p2 = new person("한글");
		 System.out.println(p2);
	}

}
