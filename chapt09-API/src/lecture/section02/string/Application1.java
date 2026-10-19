package lecture.section02.string;

import java.util.Locale;

public class Application1 {

    public static void main(String[] args) {

        String text = " Java Pro   graming";

        //조회
        System.out.println(text.length()); //길이
        System.out.println(text.charAt(3));//특정 문자열의 위치 가지고옴
        System.out.println("java 포함 했는지 : " + text.contains("Java")); //해당 문자를 포함하고 있는지.
        System.out.println("java 시작위치" + text.indexOf("a")); //어디 인덱스에 위치해 있는지 확인.
        System.out.println();

        String trimmed = text.strip();
        System.out.println("공백제거 : " + trimmed + "#");
        System.out.println("부분문자열 : " + trimmed.substring(5)); //5번째 인덱스부터 끝까지 나옴.
        System.out.println("문자열 교체 : " + trimmed.replace("Java", "Kotlin"));
        System.out.println("대문자 반환 : " + trimmed.toUpperCase());
        System.out.println("소문자 반환 : " + trimmed.toLowerCase());
    }

}
