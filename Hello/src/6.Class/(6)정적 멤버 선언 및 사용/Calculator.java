/*
 * 정적(static) 멤버
 - 클래스에 고정된 멤버
 -> 객체 생성하지 않고도 사용할 수 있는 필드와 메소드이다.
 
 * 정적 필드
 <-> 인스턴스 필드(객체 생성해야지 사용할 수 있음)
 - 객체마다 가지고 있을 필요성이 없는 공용적인 데이터라면 정적 필드로 선언하는 것이 좋다.
 ex) 파이(원주율) 처럼 변하지 않는 데이터 등...

 *정적 메소드
 -필드를 가지고 판단
 ->인스턴스 필드 사용하지 않는다면 정적 메소드로 선언

 *정적 멤버 사용
 원칙 '클래스'와 함께 사용 but 객체로도 사용은 가능하다.
 */
public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y){
        return x + y;
    }

    static int minus(int x, int y){
        return x - y;
    }
}
