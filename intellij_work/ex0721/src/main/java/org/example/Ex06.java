package org.example;

import java.util.Calendar;

class Mysingle{

    public static Mysingle ms;

    public static Mysingle getInstane(){
        if(ms == null){
            ms = new Mysingle();
            return ms;
        }else{
            return ms;

        }
    }
    public void doA(){
        System.out.println("doA");
    }
}

public class Ex06 {

    Ex06(){
        Mysingle ms1 =  Mysingle.getInstane();
        ms1.doA();
        Mysingle ms2 =  Mysingle.getInstane();
        ms2.doA();
        System.out.println(ms1);
        System.out.println(ms2);

        Calendar ca = Calendar.getInstance();
    }

    public static void main(String[] args) {
        new Ex06();

    }

}
