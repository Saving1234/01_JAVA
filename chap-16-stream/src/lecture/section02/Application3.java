//package lecture.section02;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class Application3 {
//
//    public static void main(String[] args) {
//
//        /*
//        Stream<T> sorted();
//        (Comparator<? super T> comparator);
//        sorted : 인자가 없으면 오름차순으로 정렬.
//         */
//
//        List<Integer> integerList = IntStream.of(5,4,3,2,2)
//                .boxed() // 박싱 : 기본타입 -> 참조타입으로 변경.
//                .sorted()
//                .collect(Collectors.toList()); //리스트형으로 변경. //toList();이렇게 바꾸기도 함.
//
//        System.out.println(integerList);
//
//        //compareTo : 문자열.
//
//        List<String> stringList = Arrays.asList("java", "sql", "mybatis", "jdbc", "spring", "java", "mybatis", "sql", "sql", "sql");
//
//        List<String> integerList2 = stringList.stream() //중간연산스트림.
//                .peek((str) -> System.out.println("원본" + str))
//                .sorted((s1, s2) -> s2.compareTO(s1)) //s2가 앞이면 내림차순. 반대이면 오름차순.
//                .peek((str) ->System.out.println("sorted 다음" + str))//중간 출력.
//                .distinct()//중복 제거.
//                .limit(3)
//                .collect(Collectors.toList()); //리스트형으로 변경. //toList();이렇게 바꾸기도 함.
//
//        System.out.println(integerList2);
//
//    }
//
//}
