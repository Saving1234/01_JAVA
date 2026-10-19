package lecture.section04.cleandar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Application2 {

    public static void main(String[] args) {

        /*
          LocalDate : 날짜.
          LocalTime : 시간.
          LocalDateTime : 날짜와 시간.
          ZoneDateTime : 날짜, 시간, 시간대
         */

        LocalDate date = LocalDate.of(2026, 10, 7);
        LocalTime time = LocalTime.of(18, 3, 4);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        ZonedDateTime seoulTime = dateTime.atZone(ZoneId.of("Asia/Seoul"));

        System.out.println("seoulTime = " + seoulTime);

        LocalDateTime now = LocalDateTime.now(); //현재시간 저장
        System.out.println("년 ==" + now.getYear());
        System.out.println("월 ==" + now.getMonth());
        System.out.println("일 ==" + now.getDayOfMonth());
        System.out.println("요일 ==" + now.getDayOfWeek());

        //포메팅
        // yyyy/MM/dd 등. 원래는 슬래시로 남겨서 출력해햐하는데, 한꺼번에 가져올 수있는게 있음
        String today = "2026/10/07";

        DateTimeFormatter input = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        //다른 형식으로저장된 날짜를 로컬데이트 형식으로 가져올 수 있음.
        //한글로 바꾸기 위해서는 메서드를 따로 만들어서 다시 실행해야함. 이건 알아볼 것.
        LocalDate customDate = LocalDate.parse(today, input);

        System.out.println(customDate);


        DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm");
        LocalDateTime outputExample = LocalDate.now();

        //Object
        // toString : 객체를 원하는 형태의 문자열로 출력할 수 있게.
        // equals : 재정의 한대로 객체의 값이 같은지 확인. boolean.

        // String str= ""   : 스트링 풀에 자동으로 저장.
        // 문자열은 값을 비교할 때 equals 사용하는게 안전!!
        //WrappingClass : int a -> Integer.
        // 날짜 타입 : LocalDate 로 바꿈.



    }

}
