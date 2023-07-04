package day4;

public class practice {
    public static void main(String[] args) {
//    array assignment:
        int a[] = {100, 200, 300, 400};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);


//    String assignment:
        String s="Ankit Bijlwan";
        String s1="Ankit Bijlwan";
        System.out.println(s.equalsIgnoreCase(s1));//compaire ignoring the case
        System.out.println(s.concat(s1));//concat
        System.out.println(s.length());//length of string
        System.out.println(s.substring(3,5));//substring "ki"  ask
        System.out.println(s.toUpperCase());//all upper case
        System.out.println(s.toLowerCase());//all lower case
    }
}
