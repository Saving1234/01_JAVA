package lecture.section02.encapulation.problem1;

public class Monster {

    private String name; //몬스터의 이름
    private int hp; //몬스터의 체력


    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setter
    //monster 만든 인스턴스의 필드를 수정할 때는 setHp라고 하는 메서드로만 변경하자.
    public void setHp(int num) {

        //인스턴스가 생성되었을 때 자신의 주소를 저장하는 변수.
        //this는 heap에 저장된 주소를 가리킴.


        if(num >0){
            System.out.println("양수값이 입력되어 몬스터의 체력을 바꿉니다");
            this.hp = hp;
        } else{
            System.out.println("음수값");
        }




    }
}

