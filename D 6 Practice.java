package day6;

public class Practice {
    void sum(int x, int y) {
        System.out.println(x + y);
    }
        void sum ( int x, int y, int z) {
            System.out.println(x + y + z);
        }
            void sum ( double x, double y) {
                System.out.println(x + y);
            }
                void sum ( double x, double y, double z){
                    System.out.println(x + y + z);
                }
                public static void main (String[]args){
                    Practice cal=new Practice();
                    cal.sum(2,3);
                    cal.sum(2.3,3.2);
                    cal.sum(1,2,3);
                    cal.sum(1.1,2.2,3.3);
                }
            }
