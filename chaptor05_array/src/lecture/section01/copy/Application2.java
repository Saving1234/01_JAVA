package lecture.section01.copy;

import java.util.Arrays;
import java.util.Collections;

public class Application2 {

    public static void main(String[] args) {
        int[] originArr = new int[]{1, 2, 3, 4, 5};
        //clone() : object, heap 영역의 공간 자체를 복사하고 새로운 주소값으로 반환.
        int[] copyArr = originArr.clone();

        print(copyArr);

        copyArr[0] = 99;


        int[] copyArr2 = new int[5];

        //원본 배열, 복사를 시작할 인덱스, 복사본 배열, 복사본의 복사를 시작할 인덱스, 복사할 길이)
        System.arraycopy(originArr, 0, copyArr2, 3, originArr.length);

        print(copyArr2);

        //Arrays.sort는 배열을 정렬해주는 역할.
        Arrays.sort(copyArr2);
        print(copyArr2);

        //Integer  int의 참고자료형
        //내림차순.

        Integer [] numbers = {2,3,4,4,54} ;
        Arrays.sort(numbers, Collections.reverseOrder()); //내림차순 정렬

        System.out.println(Arrays.toString(numbers));

    }


        public static void print(int[] iarr) {
        int[] originArr = new int [] {1,2,3,4,5};

        System.out.println("iarr의 hashcode : " + iarr.hashCode());

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();




    }

}
