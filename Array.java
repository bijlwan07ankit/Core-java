package day4;

public class Array {
    public static void main(String[] args) {
//      int[] a = new int[5];
//        a[0] = 100;
//        a[1] = 100;
//        a[2] = 100;
//        a[3] = 100;
//        a[4] = 100;
        int a[]={100,200,300,400,500};
       // System.out.println(a.length);
//       classic method
//        for (int i=0;i<=a.length-1;i++)
//        {
//            System.out.println(a[i]);
//        }
//    Advanced method
       for (int i:a)
       {

               System.out.println(i);
           }
       }
    }

