package ex0711;

public class Ex07 {
	// p269
	
	
	
	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("990925 -");
		
		stbuf.append(" 1012999");
		System.out.println(stbuf.toString());
		
		stbuf.delete(7, 8);
		System.out.println(stbuf.toString());
	}

}

