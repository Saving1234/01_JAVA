package lecture.section01.array;

public class Application1 {

    public static void main(String[] args) {


        /*
        * ctrl + /
        *
        *  배열
        *   동일한 자료형의 묶음
        *
        * */

        // 배열 객체 생성.
        //크기 할당.
        int[] arr = new int[5];

        arr[0] = 15;
        arr[1] = 17;
        arr[2] = 19;
        arr[3] = 19;
        arr[4] = 10;

        for(int i = 0; i<=5; i++){
            System.out.println(i);
        }



        //이렇게 하면 heap의 주소값이 나옴.
        //인텔리제이에서 읽을 수 있는 주소로 변환해서 출력.
        System.out.println(arr);


        //배열이란? 하나의 이름으로 관리되는 '연속적인' 메모리 공간.
        //인덱스? 호출해야 그 값이 나옴.
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //for를 통해 호출.





    }
}
