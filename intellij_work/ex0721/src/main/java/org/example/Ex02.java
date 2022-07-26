package org.example;

class A{
    public void doA(){                      //인스턴스 메소드
        System.out.println("doA");
    }
    public static void doB(){               //스태틱 메소드
        System.out.println("doB");
    }
}

public class Ex02 {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(3);
        Integer i2 = Integer.valueOf(10);

        int maxvalue = Integer.max(i1,i2);
        System.out.println(maxvalue);
        int minvalue = Integer.min(i1,i2);
        System.out.println(minvalue);
        int sumvalue = Integer.sum(i1,i2);
        System.out.println(sumvalue);

        System.out.println("2진수" + Integer.toBinaryString(i1));   //Integer 밑에 static method(toBinaryString())
        System.out.println("8진수" + Integer.toOctalString(i2));
        System.out.println(Integer.toHexString(i2));

        A a = new A();      //
        a.doA();

        A.doB();            //메소드 영역이기에 바로 호출 가능
    }
}
