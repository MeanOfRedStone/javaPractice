/*
<7.1 상속 개념>
 * 상속(Inheritance)
 - 부모 클래스의 멤버를 자식 클래스에게 물려준다.

 예) extedns A
 : A 클래스를 상속한다.
 

 -private 접근 제한자는 상속 x
 -default 서로 다른 패키지에 존재하면 상속 x
*/

/*
<7.2 클래스 상속>
*자바 클래스 -> 다중상속 x
 */
public class CellPhone {
    //필드
    String model;
    String color;

    //생성자

    //메소드
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    void bell() {
        System.out.println("벨이 울립니다.");
    }
    void sendVoice(String message){
        System.out.println("자기: " + message);
    }
    void receiveVoice(String message) {
        System.out.println("상대방 : " +message);
    }
    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
