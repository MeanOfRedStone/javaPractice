/*
 * do-while과 while문의 차이
 do-while은 블록 내부의 실행문을 우선 실행시키고 실행 결과에 따라 반복 실행을 계속할지 결정

 *Scanner 객체와 System.in.read()의 차이
 Scanner는 콘솔에 입력된 문자열을 한 번에 읽기 위해 사용한다.
 nextLine()와 함께 사용한다.
 */
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do{
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while( ! inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
