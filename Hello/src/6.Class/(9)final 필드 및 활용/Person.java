/*
 * final 필드
  - 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없다.

  * final 필드 초기값 설정 방법
   - (1) 필드 선언시
   - (2) 생성자

   -> 초기화 되지 않은 final 필드 -> 컴파일 에러
 */

public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name){
        this.name = name;
        this.ssn = ssn;
    }
}
