package ex0711;

public class BB {
	
	int a = 10;  //10이 20으로 바뀜
	BB(){
		this(20);  // 12항으로
		System.out.println("기본생성자");
	}
	
	BB(int a){
		System.out.println("a 생성자"); //출력
		this.a = a;
	}

	@Override
	public String toString() {
		return "BB [a=" + this.a + "]"; // this는 생략가능
	}
	
	// alt + shift + s -> s

}
