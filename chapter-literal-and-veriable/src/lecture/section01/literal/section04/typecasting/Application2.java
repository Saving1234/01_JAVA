package lecture.section01.literal.section04.typecasting;

public class Application2 {

    public static void main(String[] args) {
        
        //강제형변환
        
        long longNum = 300000000;
        int intNum = (int)longNum;

        System.out.println();
        System.out.println("intNum = " + intNum);
        
        // 숫자
        
        int num =  65;
        char num1 = (char)num; //해당되는 문자열의 숫자 출력

        System.out.println("num1 = " + num1);

        double height = 179.9;

        int floorHeight = (int) height; //소수점 정수로 변환.
        System.out.println("floorHeight = " + floorHeight);

    }

}
