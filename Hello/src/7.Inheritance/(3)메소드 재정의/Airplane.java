/*
 * 부모 메소드 호출(super)
 - 자식 클래스에서 부모 클래스의 메소드를 오버라이딩 한 경우
 -> 일반적으로 부모의 메소드는 숨겨진다.
 -> 하지만, super 키워드를 붙인다면 자식 클래스 내부에서 오버라이딩 된 부모 클래스의 메소드를 호출할 수 있다.!!!
 */
public class Airplane {
    public void land() {
        System.out.println("착륙합니다.");
    }
    public void fly(){
        System.out.println("일반비행합니다.");
    }
    public void takeOff(){
        System.out.println("이륙합니다.");
    }
}
