package sec13.exam02_constructor_access.package1;

public class B {
    //필드
    //public 제한자 -> 모드 접근 가능
    A a1 = new A(true); // (ㅇ)
    
    //default 접근자 -> 같은 패키지 접근 가능
    A a2 = new A(1); //(ㅇ)

    //private 접근자 -> 같은 클래스에서만 접근 가능
    A a3 = new A("문자열"); // (x)
}
