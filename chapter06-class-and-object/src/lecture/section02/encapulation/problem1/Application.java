package lecture.section02.encapulation.problem1;

public class Application {

    public static void main(String[] args) {


        /*
            캡슐화
            선언한 필드대로 공간은 생성되어있지만 직접 접근 못하고
            public으로 접근을 허용한 메소드만 이용 할 수 있도록 하는 것.
         */


        Monster monster1 = new Monster();
        monster1.setName("두치");
        monster1.setHp(100);
        //if로 양수일 때 this로 저장하게 하였는데, 양수가 아니니까 저장 자체가 안됨?

        System.out.println("몬스터 이름 : " + monster1.getName());
        System.out.println("몬스터 체력 : " + monster1.getHp());

       // System.out.println("monster1.name = " + monster1.name);
      //  System.out.println("monster1.hp = " + monster1.hp);

    }
}
