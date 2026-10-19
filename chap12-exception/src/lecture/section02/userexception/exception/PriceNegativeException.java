package lecture.section02.userexception.exception;

/*
  사용자 정의 예외

  Exception.
  Trow..

  예외는 메시지를 가져갈 수 있음.
 */

//상속할 에외 만들고 -> ThrowAble에서 디테일 메


//throwable에 detailMessage 필드가 있고, ex

public class PriceNegativeException extends NagativeException{

    public PriceNegativeException() {
    }

    //예외 설명을 전달해서 부모 필드(Throwable)에 저장
    public PriceNegativeException(String message) {
        super(message);
    }
}
