package lecture.section01.array;

public class Application3 {

    public static void main(String[] args) {
        
        //초기화 블록
        //괄호 넣어서 값 바로 넣어 만들기.
        //배열 길이 확정 자동으로 되고.
        int[] iarr = {1, 2, 3, 4}; //축약
        int[] iarr2 = new int[] {1, 2, 3, 4}; //축약

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("i = " + i + ":" + iarr[i]) ;
        }
    }

}
