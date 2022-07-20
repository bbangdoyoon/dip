package org.example;
class Person implements Cloneable{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Person p1 = (Person) super.clone();
        //p1.name = new String(name);
        return super.clone();
    }
}

public class Ex03 {

    public static void main(String[] args) throws CloneNotSupportedException{
        Person p1 = new Person("홍길동",50);           //Person객체 생성
        Person p2 = (Person) p1.clone();        //try, catch 하거나 clone하는 방법이 있다
        System.out.println(p1);
        System.out.println(p2);

        p1.name = "김길동";
        p1.age = 100;
        System.out.println(p1);
        System.out.println(p2);
    }
}
