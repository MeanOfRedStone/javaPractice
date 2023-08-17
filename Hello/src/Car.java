/*
 * 1. 클래스의 구성
 (1) 필드(Field)
 (2) 생성자(Constructor)
    -필드 초기화
    - 메소드 호출
 (3) 메소드(Method)
 */

 /*
  * 2. 필드 선언 시 유의사항
    - 생성자와 메소드 안에서는 선언하면 안된다.
    ->로컬 변수가 되기 때문이다.
  */

  /*
   * 3. 생성자
    - 생성자를 실행시키지 않고서는 객체 생성 불가
    - 생성자가 반드시 존재
    - 하나 이상 가질 수 있다.
    
    참고) 생성자 선언 생략하면 -> 기본 생성자 자동 추가

      
   */
public class Car {
    //필드
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
    /*
    *기본 생성자 자동으로 추가되있는 상태 
    public Car()
    */
}
