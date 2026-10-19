package lecture.section01.list.run;

import lecture.section01.list.comparator.SortPrice;
import lecture.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    //list의 정렬.

    public static void main(String[] args) {


        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));


        //원본순서.
        System.out.println("book list의 원본순서");
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        bookList.sort(new SortPrice()); //가격 오름차순 정렬. //sort는 정렬. sortprice에 오름차순 정렬로 만들었으니

        //가격 순서대로 정렬.
        System.out.println("book list의 오름차순 정렬한 순서");
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        //이렇게도 쓰임.

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });


        System.out.println("book list의 오름차순 정렬한 순서");
        for(BookDTO book : bookList){
            System.out.println(book);
        }


    }
}
