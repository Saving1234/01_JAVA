package lecture.section03.ovveriding;

public class SubClass extends SuperCalss {

    //오버라이딩 성립 요건
    /*
       1. 메소드 이름이 동일
       2. 메소드 리턴 타입이 동일
       3. 매개변수도 타입, 갯수, 순서가 동일.
       4. 코드를 실행시킬 구문만 바뀌면 됨.
       5. 접근이 가능해야 오버라이딩이 가능하다. (접근제어자가 부모 메서드보다 같거나 더 넓어야 함)
       6. final 키워드가 사용된 메서드는 오버라이딩이 불가능.
       7. 부모 클래스의 생성자를 안 만들면 자식 클래스에서도 생성자를 만들 필요가 없다? 기본 생성자 안만들면 자동으로 생성되니까.
       8. 부모 클래스의 접근제어자보다 자식 클래스가 동일하거나 넓어야 가능.
     */


    @Override
    public void method(int num){}


    //@Override
  //  private void privateMethod(){}

   // @Override
   // private final void finalMethod(){}

    @Override
    protected void protectedMethod(int num){}
}
