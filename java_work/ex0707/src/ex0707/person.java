package ex0707;

public class person {
	
	private String name;
	
	// alt + shift + s -> r setter getter
	// alt + shift + s-> construct
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "person name = " +name;
		
	}
	
    public person() {}
	public person(String name) {
		super(); // super는 생략가능하다.
		this.name = name; //this는 생략가능하나 동일한 변수이 같은 지역에 존재하면 생략 불가능
	}
}
