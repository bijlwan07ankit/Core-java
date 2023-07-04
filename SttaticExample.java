package day6;

public class SttaticExample {
    static int a = 10;    //static variable
    int b = 10;

    static void m1() {      //static method
        System.out.println("m1 static method");
    }

    void m2() {
        System.out.println("not a static method");
    }

    void m3() {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();

    }


    public static void main(String[] args) {
        System.out.println(a);
        m1();
        SttaticExample so = new SttaticExample();
        System.out.print(so.b);
        so.m2();
//        System.out.println(b);   //incorrect becoz b is not static can not call without object
//        m2();          //incorrect  b coz m2() is  static method and cant be called without creatimghg object
        so.m3();   //for m3() object is required bt to use m1 and m2 inside m3  no object creation required as per point 3

    }

}
