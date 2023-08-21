/*
 * 패키지
  - 수백 개의 클래스를 체계적으로 관리하기 위해 사용.
  (참고) 리액트의 컴포넌트와 유사
  - 폴더에서 물리적 형태로 저장해 관리한다.

  * 패키지의 역할(식별자)
  - 클래스 이름이 같더라도 서로 구분해주는 식별자의 역할을 한다.

  * 패키지의 사용
   - "패키지명" + "클래스명"
   - 클래스 이동 시 패키지 전체를 이동해주어야 한다.

   *패키지 명명
   - 도메인 포함할 경우
    상위 패키지.도메인이름.프로젝트 이름 

   *패키지 생성 방법(VSCPDE)
   -> quick fix 통해...
 */
package sec12.exam01_package_compile;
public class Application {
  public static void main(String[] args){
    System.out.println("애플리케이션을 실행합니다.");
  }
}
