public class Student extends People {
    public int studentNo;

    public Student(String name, String ssn, int studentNo){
        super(name, ssn); // 부모 생성자 호출 : name ,ssn 은 부모 생성자를 호출하기 위한 매개값으로 사용된다.
        this.studentNo = studentNo;
    }

}
