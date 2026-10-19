package exercise.problem03;



    class Calculator {

        public void checkMethod() {

        }

        public int sumTwoNumber(int a, int b) {

            return a + b;
        }

        public int minusTwoNumber(int a, int b) {

            return a-b;

        }

        public int multiTwoNumber(int a, int b){

            return a*b;
        }

        public int divideTwoNumber(int a, int b){

            return a/b;
        }

    public class Application01{

        public static void main(String[] args) {



            Calculator calc = new Calculator();

            System.out.println(calc.sumTwoNumber(10,20));
            System.out.println(calc.divideTwoNumber(10,5));
            System.out.println(calc.multiTwoNumber(10,5));
            System.out.println(calc.divideTwoNumber(10,5));


        }





    }


}

