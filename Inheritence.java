package day7;

class A {
    int a;

    void display() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    void print() {
        System.out.println(b);
    }

}

class C extends B {
    int c;

    void show() {
        System.out.println(c);

    }
}


public class Inheritence {
    public static void main(String[] args) {
        A obj = new A();  //by making object of A we can use only a class method A is main class
        obj.a = 100;
        obj.display();

        B obj2 = new B();   //by making object of B we can use A and B class methods A is perent class b is child
        obj2.a = 10;
        obj2.b = 20;
        obj2.print();
        obj2.display();


        C obj3 = new C();     //by making object of c we can use A and B  and c class methods
                                        // A is perent for b . b is perent for c
        obj3.a = 321;
        obj3.b = 231;
        obj3.c=123;
        obj3.print();
        obj3.display();
        obj3.show();
    }



}

