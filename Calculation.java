package day5;

public class Calculation {
    int x = 10;
    int y = 20;
//    void sum()
//    {  //case 1:not taking perameter not returning the value
//        System.out.println(x+y);
//    }

//    int sum(){  //case 2:not taking perameter returning the value
//        return (x+y);

    //    }
    void sum(int a, int b)
    {  //case 3: taking perameter not returning the value
        System.out.println(a+b);
    }

    public static void main(String[] args) {


        Calculation cal = new Calculation();
//        cal.sum();//case 1
        cal.sum(100, 200);//case 3
    }

//        int ans=cal.sum();//case 2 we have to hold the value
//        System.out.println(ans);
        }

