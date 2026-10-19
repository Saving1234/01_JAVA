package practice.level02.hard;

public class Application {

    public static void main(String[] args) {

        //배열이나 컬렉션이어야 모든 요소를 하나씩 사용 가능
        String[] strArr = new String[] {"영찬", "지원", "샘물", "인규"};

        for(String strArr1 : strArr){

            System.out.println(strArr1);
        }

    }
}
