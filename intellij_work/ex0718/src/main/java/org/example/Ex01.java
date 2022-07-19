package org.example;
interface AA{               //  AA interface는 변수AAA와 함수doA를 가진다.
    int AAA = 345;          // public static final이 생략되어 있어서 바로 실행가능
    void doA();
}
class AAA implements  AA{

    @Override
    public void doA() {
        System.out.println("AAA메서드 안에 doA메서드");
    }
}
// 1. class를 만들어서 상속받아 재정의 하는방법
// 2. new AA() 객체 생성과 동시에 매서드 재정의 하는 방법

public class Ex01 {
    public static void main(String[] args) {

        System.out.println(AA.AAA);
       // AA.doA            //doA는 객체 생성, override가 필요하다.

        AAA a1 = new AAA();
        a1.doA();
        AA a2 = new AA(){

            @Override
            public void doA() {
                System.out.println("AA 인터페이스 안에 doA메서드");
            }
        };
        a2.doA();
        AA a3 = () ->{
            System.out.println("a3람다 안에 doA메서드");
        };
        a3.doA();           //람다를 가장 많이 사용

    }
}
