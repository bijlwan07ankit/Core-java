package day2;

public class Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        System.out.println("-------------------arithmetic operators---------------------------");
        System.out.println("sum of a and b is" + (a + b));
        System.out.println("diffrence of a and b is" + (a - b));
        System.out.println("multiplication  is " + (a * b));
        System.out.println("division is" + (a / b));
        System.out.println("remainder is " + (a % b));
//
        System.out.println("-------------------relational operator---------------------------");
        System.out.println(a > b);//f
        System.out.println(a < b);//f
        System.out.println(a <= b);//t
        System.out.println(a >= b);//t
        System.out.println(a == b);//t
        System.out.println(a != b);//f

        System.out.println("-------------------logical operator---------------------------");

        boolean x = true;
        boolean y = false;
        System.out.println(x && y);//f
        System.out.println(x || y);//t
        System.out.println(!x);//f
        System.out.println(!y);//t

        System.out.println("-------------------increment and decrement operator---------------------------");
//        a = 15;
        a++;
//        b = 34;
        b = b - 1;
        System.out.println(a);
        System.out.println(b);
    }
}