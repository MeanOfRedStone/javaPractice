public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        //잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(100);

        //boolean 타입의 경우 설정 안해주면 false인가?????
        System.out.println("stop 확인 : " + myCar.isStop());
        //멈춤
        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
