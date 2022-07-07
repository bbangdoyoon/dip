package ex0706;

import myclass.AAA;
import myclass.ZZZ; // 같은 package일 경우 import문 생략

public class Ex02 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.doA();
		
		ZZZ zzz = new ZZZ();
		zzz.doA();
	}
}
