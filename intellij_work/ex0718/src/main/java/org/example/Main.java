package org.example;

class PA{
    public void showInfo(){
        System.out.println("PA 메서드입니다.");
    }

}

class CA1 extends PA{
    @Override
    public String toString() {
        return "CA1{}";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("C1메서드입니다.\n");
    }
}

class CA2 extends PA{
    @Override
    public String toString() {
        return "CA2{}";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("C2메서드입니다.\n");
    }
}
public class Main {
    public static void main(String[] args) {
        PA pa[] = new PA[5];
        System.out.println("pa[0] = " +pa[0]);

        pa[0] = new CA1();
        System.out.println("pa[0] = " +pa[0]);
        pa[1] = new CA2();
        System.out.println("pa[1] = " +pa[1]);

        System.out.println();
        pa[0].showInfo();
        pa[1].showInfo();

        pa[2] = new CA1();  // 여기는 에러가 없다.

        try {


            //CA1 ca1 = pa[2];  //pa2는 부모, 부모참조형을 자식 참조형으로 넣으려니 에러가 발생, 형변환이 필요 알트 + 엔터 이용 아래 2개항 처럼
            CA1 ca1 = (CA1) pa[2];
            CA2 ca2 = (CA2) pa[2]; //예외발생한 곳에서 catch로 이동

            System.out.println(ca1);
            System.out.println(ca2);
            System.out.println("여기까지 정상실행");
        }catch (Exception e){
            System.out.println("에러발생 무시..."+e);

        }

        System.out.println("프로그램 종료합니다.");


    }
}