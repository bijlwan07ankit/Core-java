package day7;

class Bank {
    double rateofintrest() {
        return 0;
    }
}
    class SBI extends Bank {
        double rateofintrest() {
            return 10.5;
        }
    }

        class ICICI extends Bank {
            double rateofintrest() {
                return 12.3;
            }

        }

        class AXIS extends Bank {
            double rateofintrest() {
                return 9.8;
            }

        }


        public class MethodOverriding {
            public static void main(String[] args) {
                SBI sbi = new SBI();
                System.out.println(sbi.rateofintrest());
                ICICI icici=new ICICI();
                System.out.println(icici.rateofintrest());
                AXIS axis=new AXIS();
                System.out.println(axis.rateofintrest());


            }

        }
