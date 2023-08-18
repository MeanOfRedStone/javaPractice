/*
 *1. 메소드의 역할
 -필드 읽고 수정
 -객체 간의 데이터 전달의 수단
 -외부로부터 매개값 받음
 -실행 후 어떤 값을 리턴

 *2.리턴 타입
 void, double,  ...
 ->리턴 타입이 있는 메소드 반드시 return문을 사용해서 지정해야 한다.

 *3.메소드 오버로딩
  - 리턴 타입과 무관
  - 매개 변수 타입, 순서, 개수와 관련이있다.
 */


public class Calculator {
    //메소드
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus (int x, int y){
        int result = x + y;
        return result;
    }

    double divide(int x, int y){
        double result = (double)x / (double)y;
        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다");
    }
}
