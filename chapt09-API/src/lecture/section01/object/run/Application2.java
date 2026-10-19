package lecture.section01.object.run;

import lecture.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {


        //toString = 클래스명@16진수 해시코드.


        /*
          equals
           객체가 정의한 기준으로 값이 같은지 비교. (동등성)
          !!!!!!!!!! String은 참조 변수라서 객체에 속하나?

           == : 두 변수가 같은 객체를 참조하는지 비교. (동일성)
           equals :객체가 정의한
         */

        Book book = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);
        Book book3 = book; //얕은 복사. //주소값 복사.


        System.out.println("book1==book2" + (book==book2));
        System.out.println("book1==book3" + (book==book3));
        //stack 영역에 있는 것만 비교. 즉, 주소값 비교.(근데 heqp에 저장된 공간이 다름. new 썼으니까)


        System.out.println("book1.equals(book2)" + book.equals(book2)); //false. equals는 object꺼니까.
    }

}
