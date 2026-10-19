package lecture.section2.grammar;

public class Application {

    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN; //UserRole1의 ADMIN이라는 상수를 넣은 변수.
        System.out.println("enum 상수" + admin); //상수를 넣은 admin 출력.
        System.out.println("enum 상수 " + admin.name()); //admin

        //메소드도 출력 가능.
        //클래스도 마찬가지지만.
        System.out.println("enum 상수 :: " + admin.getNameToLowerccase());

        //모든 상수를 순서대로 담은 배열으르 반환.
        for(UserRole1 role : UserRole1.values()){
            System.out.println(role.name());
        }

        //enum은 상수별 데이터를 저장하느느 필드와 생성자, 메서드를 가질 수 있다.

        for(UserRole2 role : UserRole2.values()){
            System.out.println(role.name()+ "_" +role.getDecscription());
        }
    }
}
