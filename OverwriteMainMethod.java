package day6;

public class OverwriteMainMethod {
    public  void main (int x)
    {
        System.out.println(x);
    }

    public void main(int x,int y) {
        System.out.println(x+y);

    }

    public static void main(String[] args) {
        OverwriteMainMethod mo = new OverwriteMainMethod();
        mo.main(20);
        mo.main(10,23);
    }
}
