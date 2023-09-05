public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "123-123", 1);
        //부모에게 물려받은 필드 출력
        System.out.println("name : " + student.name);
        System.out.println("ssn : " + student.ssn);
        //자식 클래스의 필드
        System.out.println("studentNo : " + student.studentNo);
    }
}
