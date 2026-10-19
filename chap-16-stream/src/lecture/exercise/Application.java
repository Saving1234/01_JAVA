package lecture.exercise;

import java.util.Arrays;
import java.util.List;

public class Application {


    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("레디 플레이어 원", "SF", 2018, 8.3),
                new Movie("어벤져스: 엔드게임", "액션", 2019, 8.7),
                new Movie("소울", "애니메이션", 2020, 8.7),
                new Movie("듄", "SF", 2021, 8.4),
                new Movie("탑건: 매버릭", "액션", 2022, 8.8),
                new Movie("오펜하이머", "드라마", 2023, 8.7),
                new Movie("듄: 파트 2", "SF", 2024, 9.0),
                new Movie("미키 17", "SF", 2025, 7.7)
        );

        // 장르와 평점은 스트림 연습을 위해 구성한 실습용 데이터이다.

        // 1. 장르가 "SF"인 영화의 평균 평점을 구하고 소수점 둘째 자리까지 출력하기
        // 결과 : 1. SF 영화의 평균 평점: 8.35

//        double sgAverageRating = movies.stream()
//                .filter(movie -> movie.getGenre().equals("sf"))
//                .mapToDouble(Movie::getRating)
//                .average()
//                //.getAsDouble();
//
//        System.out.println("sf영화의 평균 평점" + sgAverageRating);


        // 2. 2021년부터 개봉한 영화를 평점 내림차순으로 정렬하여 제목 리스트로 출력하기
        // 결과 : 2. 2021년부터 개봉한 영화: [듄: 파트 2, 탑건: 매버릭, 오펜하이머, 듄, 미키 17]


        List<String> arrayDownword = movies.stream()
                .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))
                .filter(mV -> mV.getReleaseYear()>=2021)
                .map(m2 -> m2.getTitle())
                .toList();
        System.out.println(arrayDownword);

        // 3. 개봉 연도를 기준으로 가장 최근에 개봉한 영화 3편의 제목을 출력하기
        // 결과 : 3. 최근 개봉 영화 3편: [미키 17, 듄: 파트 2, 오펜하이머]

        List<String> conturyMovie = movies.stream()
                .sorted((m1,m2)-> Integer.compare(m2.getReleaseYear(), m1.getReleaseYear()))
                .limit(3)
                .map(m3 -> m3.getTitle())
                .toList();

        System.out.println(conturyMovie);


        // 4. 평점이 8.7 이상인 영화들의 장르를 중복 없이 오름차순으로 정렬하여 출력하기
        // 결과 : 4. 평점 8.7 이상 영화의 장르: [SF, 드라마, 애니메이션, 액션]

        List<String> upword = movies.stream()  //distinct와 sorted를 같이 쓰면 에러.
                .filter(mU -> mU.getRating()>=8.7)
                .map(m4 -> m4.getGenre())
                .distinct()
                .sorted()
                .toList();
        System.out.println(upword);
        //distinct와 sorted를 같이 쓰면 에러.
        //movie 상태에서 distinct와 sorted를 같이 쓰면 movie 전체를 비교하려고 함.
        //중복 기준 등이 없으면 문제가 생김.
        }
    }






