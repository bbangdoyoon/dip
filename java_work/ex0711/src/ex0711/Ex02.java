package ex0711;

public class Ex02 {
	Ex02(){
		AA aa = new AA(); //객체 생성  AA가 static이 아니여서
		aa.doA();       //void doa호출 
		aa.doA(10);     //void doa호출 int a = 10
		aa.doA(10,20);  //void doa호출 int a = 10, b=20
	}
	
	AA aa = new AA(); //객체 생성  AA가 static이 아니여서
	
	public static void main(String[] args) {
		
		new Ex02();
		
		
	}

}
