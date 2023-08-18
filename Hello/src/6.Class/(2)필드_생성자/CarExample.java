/*
 * 1. 클래스 외부에서 필드 사용 방법
    ->클래스로부터 객체를 만들어 사용한다.
 */

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        //생성자 선언시 기본 생성자 사용할 수 없다.
        // Car myCar = new Car();
        
        
        /*
        *필드 공부 내용. 생성자 다루면서 주석처리
        //필드값 읽기
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        //필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
        */

        Car myCar = new Car("검정", 3000);

        //필드값 주석처리 해서 매개 변수 넣어줘도 출력할 수 없다.
        // System.out.println("생성자 선언을 통한 값 확인 :" + myCar.color);

    }
}
