/*
 * 메소드를 통한 데이터 변경
 -> 객체 지향 프로그래밍에서 '객체의 무결성' 유지를 위해
 (1) Setter
 -데이터 변경시
 ->메소드로 매개값을 검증 후 유요한 값만 데이터로 저장

 (2) Getter
 -데이터 읽을 때
 -> 메소드로 필드 값을 가공한 후 외부로 전달

 * 필드 선언 시 권장 사항!!!
 - 가능하면 privtate으로 선언 -> 외부 클래스로부터 보호
 - Getter 와 Setter를 통해 변경 / 사용
 */
public class Car {
    //필드
    private int speed;
    private boolean stop;

    //생성자

    //메소드
    //Getter
    public int getSpeed() {
        return speed;
    }

    //Setter
    public void setSpeed(int speed){
        if(speed < 0){
            this.speed = 0;
            return;
        } else{
            this.speed = speed;
        }
    }
    
    //boolean 타입의 경우 Getter 앞 : is...()
    public boolean isStop(){
        return stop;
    }
    public void setStop(boolean stop){
        this.stop = stop;
        this.speed = 0; 
    }
}
