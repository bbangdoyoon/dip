package org.example;

class INum{
    int num;

    public  INum(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object o){
        INum iNum = (INum) o;
        return this.num == iNum.num;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        INum iNum1 = new INum(10);
        INum iNum2 = new INum(10);
        INum iNum3 = new INum(12);
        System.out.println(iNum1==iNum2); //heap영역에 있으나 내용이 같지 않다 equals메소드를 사용해야 한다.
        System.out.println(iNum1);
        System.out.println(iNum2);

        System.out.println(iNum1.equals(iNum2));
        System.out.println(iNum1.equals(iNum3));
    }
}
