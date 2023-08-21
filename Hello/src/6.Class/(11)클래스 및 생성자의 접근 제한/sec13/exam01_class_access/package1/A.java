package sec13.exam01_class_access.package1;

/*
 * 라이브러리 클래스 설계 원칙
 - 외부 클래스에서 접근할 수 있는 멤버 | 접근할 수 없는 멤버로 구분
 -> 접근 제한자(Access Modifier)를 제공

 *접근 제한자의 종류 : public, protected, default, private
 (1) public : 클래스, 필드, 생성자, 메소드 | 모드 접근 가능
 (2) protected : 필드, 생성자, 메소드 | 자식 클래스가 아닌 다른 패키지에 소속된 클래스는 접근 불가
 (3) default : 클래스, 필드, 생성자, 메소드 | 다른 패키지에 소속된 클래스는 접근 불가
 (4) private: 필드, 생성자, 메소드 | 모든 외부 클래스
 */

 /*
  * 클래스의 접근 제한 - public, defualt
  (1) default: public을 생략하면 된다.
  (2) public : 모두 접근 가능 -> 라이브러리 만들 때
  */


  //defualt 접근 제한
class A {
    
}
