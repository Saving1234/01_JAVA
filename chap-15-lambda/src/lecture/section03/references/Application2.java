package lecture.section03.references;

import java.util.function.Function;

public class Application2 {


    //생성자 메서드 참조.

    public static void main(String[] args) {

        Account account = new Account("bear");
        //매개변수 스트링 받고, 어카운트 객체를 반환함.

        Function<String, Account> function = (str) -> new Account(str);
        Function<String, Account> function2 = Account::new;

        Account account1 = function.apply("bear2");
        System.out.println(account1);



    }

}
