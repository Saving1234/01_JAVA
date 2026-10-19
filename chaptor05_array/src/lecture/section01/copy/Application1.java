package lecture.section01.copy;

public class Application1 {

    public static void main(String[] args) {

        int age = 10;
        int age2= age;

        //배열의 복사
        //얕은 복사 : stack 주소값만 복사
        // 깊은 복사 : heap배열의 저장된 값을 새로운 주소값으로 복사


        int[] originArr = {1,2,3,4,5}; //원본배열
        int[] copyArr = originArr; //얕은 복사

        copyArr[0] = 99; //얕은 복사. 근데 복사라기보다는  원본과 복제본 둘 다 같은 공간이 됨.

        System.out.println("originArr = " + originArr[0]);
        System.out.println("copyArr = " + copyArr[0]);

       // System.out.println(originArr.hashCode());
      //  System.out.println(copyArr.hashCode());

    }
}
