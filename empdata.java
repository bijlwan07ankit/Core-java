package day5;

public class empdata {
    public static void main(String[] args) {

        employee emp1 = new employee();
        {
            emp1.eid = 123;
            emp1.ename = "ankit";
            emp1.job = "testing";
            emp1.sallary = 25000;
            emp1.dept_no = 01;
            emp1.display();
        }
        employee emp2 = new employee();
        {
            emp2.eid = 123;
            emp2.ename = "Divya";
            emp2.job = "testing";
            emp2.sallary = 30000;
            emp2.dept_no = 2;
            emp2.display();

        }
    }
}
