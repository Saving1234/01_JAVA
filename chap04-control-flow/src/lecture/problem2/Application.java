package lecture.problem2;


public class Application {

//홀수/ 짝수
    public static void oddNumber(int x){

        if(x % 2 ==0){
            System.out.println("짝수다!");
        } else{

            System.out.println("홀수다!");
        }

    }

    public static double bmi (int x, int y) {
        //키 x
        //체중 y

        double bmi = y/Math.pow(x,2);
        int bmii = (int) (bmi/100);



        if (bmii >=18 && bmii < 23) {
            System.out.println("정상체중입니다");
        }  else if(bmii >= 23 && bmii < 25) {
            System.out.println("과체중입니다");
        } else if(bmii >= 25 && bmii <30){
            System.out.println("경도 비만입니다!");
        } else if(bmii >=30 && bmii <35) {
            System.out.println("중등도 비만입니다!");
        } else{
            System.out.println("고도비만 입니다! 살 뺴세요");
        }




        return bmii;


    }

    public static String Munja(String x){

       String a = "apple";
       char[] ab = a.toCharArray();

        System.out.println(ab);

       

    }

    public static int numbers(int x) {

        int i=0;
        for (i = 1; i >= x; i++) {

            if (i % 3 == 0) {
                System.out.println("수");
            }
            if (i % 2 == 0) {
                System.out.println("박");
            }
        }
          return i;
    }

}
