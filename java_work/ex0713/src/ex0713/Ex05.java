package ex0713;

class AA{
	AA(){
		System.out.println("AA 기본생성자"); // 출력이후 9항으로가서 11항 
	}	
}
class BB extends AA{
	BB(){  // 4항으로가서 5항 출력
		super(); // super는 생략가능 (부모클래스의 생성자를 호출하는 기능)
		System.out.println("BB 기본생성자");
	}	
}
public class Ex05 {
	public static void main(String[] args) {
		new BB();
	}

}
