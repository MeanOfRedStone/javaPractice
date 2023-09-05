/*
 * 부모 클래스 생성자
 - 상속 시 입력하지 않아도 자식 생성자의 맨 첫줄에서 호출된다.
 - super(매개값); 
 */
public class People {
    public String name;
    public String ssn;

    public People(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
}
