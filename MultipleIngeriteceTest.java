package Day8;
interface abc{
    int a=100;
    void m1();}
interface xyz{
    int b=200;
    void m2();
}
public class MultipleIngeriteceTest implements abc,xyz{
    @Override
    public void m1() {
        System.out.println(a);
    }

    @Override
    public void m2() {
        System.out.println(b);
}
{

}
    public static void main(String[] args) {
        MultipleIngeriteceTest test=new MultipleIngeriteceTest();  //todo:multiple inheritance
        test.m1();
        test.m2();
        abc test1=new MultipleIngeriteceTest();
        test1.m1();
    }
}
