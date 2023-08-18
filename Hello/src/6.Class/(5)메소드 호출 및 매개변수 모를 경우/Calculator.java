/*
 *1. 메소드의 역할
 -필드 읽고 수정
 -객체 간의 데이터 전달의 수단
 -외부로부터 매개값 받음
 -실행 후 어떤 값을 리턴

 *2.리턴 타입
 void, double,  ...
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
