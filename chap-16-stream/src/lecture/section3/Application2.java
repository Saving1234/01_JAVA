package lecture.section3;

import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        //match
        //조건에 따라 true나 false
        //anyMatch : 하나라도 조건을 만족하는 값이 있으면 true
        //allMathch : 모두 조건을 만족하면.
        //noneMatch : 모두 조건을 만족하지 않으면 true
        List<String> strList = Arrays.asList("java", "spring", "springboot");

        boolean anyMatch = strList.stream()
                .anyMatch(str -> str.contains("p"));

          System.out.println(anyMatch);

          boolean allmatch = strList.stream()
                  .allMatch(str -> str.length() > 4);
                System.out.println(allmatch);



    }
}
