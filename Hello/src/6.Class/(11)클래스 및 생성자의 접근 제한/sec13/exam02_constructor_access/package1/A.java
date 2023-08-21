package sec13.exam02_constructor_access.package1;
/*
 * 생성자의 접근 제한 - public, protected, default, private
 (1) public - 모드 접근 가능 
 (2) protected : 다른 패키지는 접근 불가(예외 : 자식 클래스는 가능)
 (3) default: 다른 패키지는 접근 불가
 (4) private : 오로지 같은 클래스에서만
*/

public class A {
    //필드
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    //생성자
    //public 접근 제한
    public A(boolean b) {}

    //default 접근 제한
    A(int b) {}

    //private 접근 제한
    private A(String s) {}
}
