package lecture.section01.logical;

public class Application3 {

    public static void main(String[] args) {
        
        // 단락평가
        /*/
        &&와 ||에서 앞의 조건만으로 전체 결과가 결정되면 뒤의 조건을 실행하지 않는 규칙
         */
        
        int num = 10;
        int zero = 0;
        
       // int result = num / zero;
       // System.out.println("result = " + result);

        //앞의 조건이 false가 되므로 and 연산으로 비교할 뒤의 조건을 실행하지 않는다.
        //boolean result = ((num / zero) >2) && zero !=0;
       //System.out.println("result = " + result);//

        //앞이 false이면 굳이 반환할 필요가 없으니 false로 나옴. 앞이 f
        
        int count = 10;
        boolean result2 = true || ++count > 0 ;
        System.out.println("result2 = " + result2);

        //
        
    }

}
