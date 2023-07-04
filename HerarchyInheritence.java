package day7;

import org.w3c.dom.ls.LSOutput;

class parent {
    int a;

    void display() {
        System.out.println(a);
    }
}

class child1 extends parent {
    int x;

    void show() {
        System.out.println(x);
    }
}

class child2 extends parent {
    int y;

    void print() {
        System.out.println(y);
    }

}


public class HerarchyInheritence {
    public static void main(String[] args) {
        child1 c1=new child1();
        c1.a=10;
        c1.x=67;
        c1.display();
        c1.show();    //can not  call print()

        child2 c2=new child2();
        c2.a=10;
        c2.y=32;
        c2.print();
        c2.display();   //can not call show()


        }
    }

