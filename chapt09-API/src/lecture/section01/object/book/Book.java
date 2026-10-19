package lecture.section01.object.book;

import java.util.Objects;

public class Book {

    private int number;// 책번호
    private String title; // 제목
    private String author; // 작가
    private int price; // 가격


    //기본생성자
    public Book(){}

    //매개변수 있는 생성자
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getter/setter

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //오버라이딩. tostring.
    //문자열 예쁘게 반환 방법. 좀 빠르게.
    //필드를 가지고 와서
    //자식 클래스에서 재정의 함. 그럼 자식클래스에서 tostring 메서드를? 질문.

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    //equals. 즉, equals를 Book으로 가지고 오기 위해.
    @Override
    public boolean equals(Object o) {
        if (o == null //인자로 받은 객체가 null이면 fals. (다르다)
          || getClass() != o.getClass())
            //getClass() : 현재 자신의 클래스 정보와 비교대상의 클래스 정보가 다르면 false
            return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
        //필드의 넘버와 비교할 넘버와같고, 프라이스도 같고, 타이틀과 아더도 같고.
        //다 같으면 true. 반환.
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
