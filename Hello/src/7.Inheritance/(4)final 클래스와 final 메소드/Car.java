/*
 * final + 메소드
 ->최종적인 메소드이므로 오버라이딩 할 수 없다.
 */
public class Car {
    //필드
    public int speed;

    //메소드
    public void speedUp() { speed += 1;}

    //final 메소드
    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
