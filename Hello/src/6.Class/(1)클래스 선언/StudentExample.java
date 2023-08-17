/*
 * 클래스의 종류
 (1) 라이브러리용(API : Application Program Interface)

 (2) 실행용
 실행 진입점(Entry Point) 인 main() 메소드 제공하는 역할

 ->프로그램이 단 하나의 클래스로 구성된다면 (1)과 (2)를 합쳐도 좋은 방법일 수 있다.
 ->하지만 대부분의 객체 지향 프로그램은 라이브러리와 실행 클래스를 분리한다.
 */

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
