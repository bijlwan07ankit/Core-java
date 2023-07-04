package day5;

public class Constructordemo {
    int x;
    int y;

    Constructordemo() {  //default Constructordemo
        x = 10;
        y = 20;

    }

    Constructordemo(int a, int b) {   //perameterized constructor
        x = a;
        y = b;
    }

    void display() {
        System.out.println(x + y);
    }


    public static void main(String[] args) {
        Constructordemo cm = new Constructordemo();    //invoked the default constructor
        cm.display();
        Constructordemo cm1 = new Constructordemo(100,200); //invokes perameterized constructor
        cm1.display();

    }
}
