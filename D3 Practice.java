package day3;

public class Practice {
    public static void main(String[] args) {


//        int a = 0;
//        if (a > 0) {
//            System.out.println("Number is Positive");
//        } else if (a < 0) {
//            System.out.println("Number is negetive");
//        } else {
//            System.out.println("the number is zero neither positive nor negetive");
//        }

//        Greatest Number

//        int a=30;
//        int b=7;
//        int c=10;
//        if ((a>b) && (a>c))
//        {
//            System.out.println("a is greatest number");
//        }
//        else if ((b>a) && (b>c))
//        {
//            System.out.println("b is greatest number");
//        }
//        else
//        {
//            System.out.println(" c is Gretest Number");
//        }
//    }

//        multiples of 5
//        int table = 5;
//
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println((table)+ "*"+ (i) +"=" +(5*i));
//        }
//    }

//    count the digit of a number
        int a = 78734;
        int count = 0;
        int j;

        while (a>0)
        {
            j=a%10;
            a = a / 10;
            count++;
        }
        System.out.println(count);
    }
}


