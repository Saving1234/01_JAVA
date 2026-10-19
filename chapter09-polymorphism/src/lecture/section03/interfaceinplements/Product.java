package lecture.section03.interfaceinplements;

public class Product extends Object implements InterProduct, Test{

    public void nonstaticMethod() {

    }
    //추상메서드 있어야하니, 오버라이드.



    @Override
    public void nonStaticMethod() {

        System.out.println("Product 클래스에서 구혀한 nonStaticMethod");

    }

    @Override
    public void abstMethod() {

        System.out.println("Product 클래스에서 구현한 testMethod");

    }

    @Override
    public void testMethod() {

    }
}
