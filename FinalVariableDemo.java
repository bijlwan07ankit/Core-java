package day7;

public class FinalVariableDemo {
    final int speed=40;     //final variable we can not change its value
    public static void main(String[] args) {
        FinalVariableDemo sp=new FinalVariableDemo();
//         sp.speed =100;       //compile time error
        System.out.println(sp.speed);

    }
}
