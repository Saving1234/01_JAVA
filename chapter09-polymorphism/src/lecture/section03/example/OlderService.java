package lecture.section03.example;

//주문을 처리하는 클래스
public class OlderService {
//여긴 클래스니까.
    //필드
    private final PaymentProcesser paymentProcesser;

    //생성자.
    public OlderService(PaymentProcesser paymentProcesser) {
        this.paymentProcesser = paymentProcesser;
    }

    public void checkOut(int amount){
        System.out.println("주문 결제를 시작합니다...");

        if(paymentProcesser.pay(amount)){
            System.out.println("주문이 완료되었습니다");
        } else{
            System.out.println("주문이 실패하였습니다");
        }
    }

}
