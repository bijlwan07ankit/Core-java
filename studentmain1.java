package day5;

public class studentmain1 {
    public static void main(String[] args) {
        Student stu1 = new Student(1001, "john", 'a');//assign values by using constructor

//        assign values by using reference
//        stu1.sid = 101;
//        stu1.sname = "Ankit";
//        stu1.grade = 'A';
//        stu1.display();


//        assign values by using method: make a method in the class getvalues and call it in main
//        Student stu2 = new Student();

//            stu2.getvalues(1001, "Ankit", 'A');
//            stu2.display();
//        not printing stu2
        stu1.display();

    }
}


