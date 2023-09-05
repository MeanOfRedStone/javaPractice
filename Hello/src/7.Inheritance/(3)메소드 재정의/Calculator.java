/*
 <7.4 메소드 재정의>
 -상속된 일부 메소드를 자식 클래스에서 다시 사용하는 것을 말한다.

 *메소드 재정의(@Override)
 오버라이딩하면 자식 객체에서 메소드를 호출할 시 바뀐 메소드가 호출된다.
 (주의사항)
 -부모의 메소드와 동일한 시그니처(리턴 타입, 메소드 이름, 매개 변수 리스트)를 가져야한다.
 -접근 제한을 더 강하게 할 수 없다. ->반대는 가능
 -새로운 예외(Exception)을 throws 할 수 없다
 */


public class Calculator {
    double areaCircle(double r){
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
