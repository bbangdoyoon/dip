package org.example;

import java.util.StringTokenizer;

public class Ex04 {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("08:07:06",":");
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
