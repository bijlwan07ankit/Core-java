package day6;

public class ThisKeyword {
    int a,b;  //instance or class variable
//    void getvalue(int x,int y) // method variable
    void getvalue(int a,int b)   // class variable and method variable are same
    {
        this.a=a;
        this.b=b;
            }
            void printvalues(){
                System.out.println(a);
                System.out.println(b);
            }

    public static void main(String[] args) {
        ThisKeyword th=new ThisKeyword();
        th.getvalue(10,20);
        th.printvalues();

    }
}
