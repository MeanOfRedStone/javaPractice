/*
  <변수 명명 규칙>
  *(1) 첫 번째 글자 : 문자 , $, _
  *(2) 영어 대소문자는 구분된다.
  (3) 첫 문자는 영어 소문자로 시작, 다른 단어와 결합할 때 뒷 단어는 대문자로 시작한다.
  (4) 문자 길이 제한은 없다.
  (5) 자바 예약어는 사용할 수 없다.

 */

public class VariableExample {
    public static void main(String[] args){
        int value = 10;

        int result = value + 10;

        System.out.println(result);
    }
}
