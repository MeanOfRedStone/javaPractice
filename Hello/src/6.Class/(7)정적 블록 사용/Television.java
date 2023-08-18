/*
 * 정적 필드 초기화
 - 정적 필드는 보통 선언과 동시에 초기값을 준다.
 - 하지만 초기화 작업이 필요한 경우 정적 블록(static block) 내에서 진행한다.

 *정적 메소드와 블록 선언 시 주의 사항
 - 객체 생성하지 않기 때문에 static block 내부에서 인스턴스 필드와 메소드 사용 불가
 */
public class Television {
    static String company = "samsung";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model; 
    }
}
