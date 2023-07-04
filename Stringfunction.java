package day4;

import java.util.Locale;

public class Stringfunction {
    public static void main(String[] args) {
//
//
//       length of string and concat function


        String s = "welcome";
        String s1 = "to java";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.concat(s1));

//trimming  the string

        String s2 = "  welcome  ";
        System.out.println(s2);
        System.out.println(s2.trim());
        String s3 = "Welcome";
        String s5="WELCOME";


//        CharAt, contains, equals equalIgnoreCase(),replace(),substring(),tolowercase(),touppercase(),function
        System.out.println(s.charAt(3));//c
        System.out.println(s.contains("come"));  //True
        System.out.println(s.equals(s3));   //False
        System.out.println(s.equalsIgnoreCase(s3));
        System.out.println(s1.replace("java","selenium"));
        System.out.println(s1.replace('e','o'));


//        -----------------------------------------------------------------------------------------------------
//        s.substring(starting index,ending index);
//        starting index start from 0
//        ending index starts from
//        ------------------------------------------------------------------------------------------
            s="welcome";
        System.out.println(s.substring(0, 3));  //wel
        System.out.println(s.substring(1, 3));  //el
        System.out.println(s.substring(2, 3));  //l

        System.out.println(s.toUpperCase());   //WELCOME
        System.out.println(s5.toLowerCase());  //welcome

//        ----------------------------------------------------------------------------------------------------------

    }
}
