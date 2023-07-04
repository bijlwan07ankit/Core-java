package day6;

public class ConstructorOverloading {
    ConstructorOverloading(int a,int b){
        System.out.println(a+b);
    }
    ConstructorOverloading(int a,double b){
        System.out.println(a+b);
    }
    ConstructorOverloading(double a,int b){
        System.out.println(a+b);
    }
    ConstructorOverloading(double a,double b){
        System.out.println(a+b);
    }
    ConstructorOverloading(int a,int b,int c){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ConstructorOverloading co=new ConstructorOverloading(100,200);
        ConstructorOverloading co1=new ConstructorOverloading(100,200.2);
        ConstructorOverloading co2=new ConstructorOverloading(100.2,200);
        ConstructorOverloading co3=new ConstructorOverloading(100.2,200.2);
        ConstructorOverloading co4=new ConstructorOverloading(100.2,200.2);


    }
}
