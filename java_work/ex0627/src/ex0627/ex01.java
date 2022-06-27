package ex0627;

public class ex01 {

	public static void main(String[] args) {

//      변수... 선언
//		변수의 사용 용도에 따라...
//		int double String boolin
//		형변환... 자동형변환 수동형변환
//		num ++
//		num+=1
//	    num

		int a = 10;
		double b = a;

		double c = 30.44;
		int d = (int) c;

		System.out.println("b = " + b);
		System.out.println("d = " + d);

		System.out.println("(3+4)*5 = " + (3 + 4) * 5);
		System.out.println("3>4 = " + (3 > 4));

		int num1 = 3;
		System.out.println("3>4 =" + (3 > 4 && (num1 += 3) < 3));
//		&&는 그리고, 앞이 거짓이면 뒤는 작업을 안함
		System.out.println("num1 = " + num1);
		System.out.println("3>4 =" + (3 > 4 || (num1 += 3) < 3));
		System.out.println("num1 =" + num1);

	}
}
