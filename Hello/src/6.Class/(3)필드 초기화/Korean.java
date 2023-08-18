/*
 * 필드 값 초기화
 (1) 항상 같은 값을 유지하는 경우
 -클래스 선언 시 필드에 초기값을 지정해준다.
 (2) 객체마다 다른 값을 가져야 하는 경우
 -생성자 선언시 매개값을 필드에 전달해준다.
 */
public class Korean {
    //필드
    String nation = "대한민국";
    String name;
    String ssn;


    /*
     * 매개변수 명명시 관례상 필드값과 동일하게 해줌
     ->필드값을 구분하기 위해 'this' 참조 변수 사용한다.
     */
    //생성자
    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
}
