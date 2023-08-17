/*
 * 클래스 메소드 명명 규칙
 (1) 클래스
 소스 파일명과 대소문자가 일치해야한다.

 (2) 메소드
 main 메소드는 다른 이름으로 바꾸면 안된다. JVM 구동시 가장 먼저 찾는 메소드이기 때문이다.(Entry point)
 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, welcome tothe java world!");
    }
}
