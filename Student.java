package day5;

import java.security.spec.RSAOtherPrimeInfo;

public class Student {
  int sid;
  String sname;
  char grade;
  Student (int id,String name, char g) //constructor
  {
        id=sid;
        name=sname;
        g=grade;
    }
//  void getvalues(int id,String name, char g){   //method
//      id=sid;
//      name=sname;
//      g=grade;
//  }
  void display()
  {
      System.out.println(sid);
      System.out.println(sname);
      System.out.println(grade);;
//      System.out.println(sid+" "+sname+" "+grade);
  }

}
//Method
//