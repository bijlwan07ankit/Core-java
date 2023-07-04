package day6;

import java.lang.reflect.Method;

public class MethodOverloading {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, double b) {
        System.out.println(a + b);
    }

    void add(double a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }


    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();{
            mo.add(2,3);
            mo.add(2,3.3);
            mo.add(2.3,3);
            mo.add(2.3,3.4);
            mo.add(2,3,4);
        }
    }
}
