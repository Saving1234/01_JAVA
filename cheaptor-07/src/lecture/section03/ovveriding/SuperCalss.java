package lecture.section03.ovveriding;

public class SuperCalss {

    //오버라이딩 성립 요건
    /*
       1. 메소드 이름이 동일
       2. 메소드 리턴 타입이 동일
       3. 매개변수도 타입, 갯수, 순서가 동일.
       4. 코드를 실행시킬 구문만 바뀌면 됨.
       5. 접근이 가능해야 오버라이딩이 가능하다. (접근제어자가 부모 메서드보다 같거나 더 넓어야 함)
       6. final 키워드가 사용된 메서드는 오버라이딩이 불가능.
     */

    //일반 메서드
    public void method(int num){

    };

    // 프라이빗 메서드
    private void privateMethod(int num) {};
    // 퍼블릭 메서드
    public final void finalMethod(int num){};
    //프로텍티드 메서드
    protected void protectedMethod(int num){};

}
