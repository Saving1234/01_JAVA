package lecture.section3;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        //최소 최대 총합 평균.

        long count = IntStream.range(1,10).count();
        System.out.println("Coubt =" + count);

        long sum = IntStream.range(1,10).sum();
        System.out.println("Coubt =" + sum); //1~9까지 총합.


        //OPTIONAL : 있을 수도 있고, 없을 수도 있는.
        OptionalDouble average = IntStream.range(1,10).average();
        System.out.println("Coubt =" + average.getAsDouble()); //왜 getADouble을 써야하는지?

        OptionalInt max = IntStream.range(1,10).max();
        System.out.println("Coubt =" + max.getAsInt());

        int oddSum = IntStream.range(1,10)
                .filter(i -> i%2 ==0)
                .sum();

    }

}
