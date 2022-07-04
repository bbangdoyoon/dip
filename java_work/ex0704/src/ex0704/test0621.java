package ex0704;

public class test0621 {
	
/*145p 문제1. 값을 반환하는 메소드의 정의
 * 인자로 원의 반지름을 전달하면 원듸 넓이를 계산해서 반환하는 메소드와 
 * 원의 둘렐르 계산하여 반환하는 메소드를 각각 정의하고,
 * 이 둘을 호출하는 main메소드를 정의하자
 */
    public static double carea(double r) {
	    return r*r*3.14;
    }
    public static double cround(double r) {
    	return 2*3.14*r;
    }
    public static void main(String[] args) {
		System.out.println("carea(3) = " +carea(3));
		System.out.println("cround(3) = "+cround(3));
	}

}
