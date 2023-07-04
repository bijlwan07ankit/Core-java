package Day8;
interface A{
    int a=10;   //todo: variable in interface is static and  final
    void m();    //todo:abstract method,by default public

    }
public class Test implements A {
    public void m() {
        System.out.println(a);
    }
    public static void main(String[] args) {
//       Test t1=new Test();
//       t1.m();

        A t=new Test();
        t.m();



    }


    }

