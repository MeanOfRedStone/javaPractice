/*
 * 1. 클래스 외부에서 필드 사용 방법
    ->클래스로부터 객체를 만들어 사용한다.
 */

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car();
        
        //필드값 읽기
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        //필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);

    }
}
