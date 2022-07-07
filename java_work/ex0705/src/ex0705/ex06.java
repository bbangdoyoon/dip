package ex0705;

public class ex06 {
	
	public static void main(String[] args) {
		
		BankAccount a1 = new BankAccount("960924", "1234-1234", 1000);      //메모리상에 올라감, BankAccount를 a1로 본다.
		 // initacc 호출시 j에 96~, a에1234~,int b에 1000대입
		a1.deposit(2000);
		a1.printbal();
		
		BankAccount a2 = new BankAccount();      //new를 선언해야 새로만든다.
		
		
	}

}
