package lecture.section02.abstractClass;

//추상클래스.
//abstract로 선언해주어야함.
public abstract class Product{


    //필드를 가질 수 있음.
        private int nonStaticField;
        private int staticFiled;


        public void publicMethod(){
            System.out.println("dddd");
        }


        //추상메서드
    //상속받는 클래스는 추상메서드를 언제나 만들어야 함.
        public abstract void avstMethod();


}


