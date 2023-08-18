/*
 * 싱글톤
  - 전체 프로그램에서 단 하나의 객체만 만들도록 보장된 '객체'를 말한다.
  - new 연산자로 호출 x
    -> 생성자 앞에 'private'이라는 접근 제한자를 붙여주자!!
  
 * 싱글톤 선언 방법
  - 자신의 타입인 정적 필드를 하나 선언한다.
  -> (주의)클래스 내부에서는 new 선언 가능
  - 자신의 객체를 생성해 초기화한다.
  - 외부에서 호출 할 수 있도록 -> 정적 메소드 getInstance() 선언하여 싱긅톤 객체 return해준다.
 */
public class Singleton {
    //자신의 타입인 정적 필드를 하나 선언(필드명 singleton)
    private static Singleton singleton = new Singleton();

    //자신의 객체를 생성해 초기화
    private Singleton(){}

    //정적 메소드 (호출용)
    static Singleton getInstance(){
        return singleton;
    }

}
