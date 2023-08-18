/*
 * 오버로딩의 개념
 -다양한 종류의 매개변수를 가지고 객체를 생성하기 위해 여러개의 생성자를 선언하는 것.
 */

public class Car {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 1
    Car(){
    }

    /*
     * 생성자 2, 3을 필드 초기화할 때 생성자 4의 매개변수를 불러오도록 하는 방법
     */
    //생성자 2
    Car(String model){
        this(model, "은색", 250);
    }

    //생성자 3
    Car(String model, String color){
        this(model, color, 250);
    }

    //생성자 4
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
