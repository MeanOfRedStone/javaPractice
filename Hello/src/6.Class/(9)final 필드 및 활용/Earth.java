/*
 * 상수
  - 불변의 값을 저장하는 필드 : 상수

  - final 필드는 상수가 될 수 없다.
  ->final 필드는 객체마다 저장되고, 생성자의 매가값을 통해서 여러 가지 값을 가질 수 있기 때문이다.

  * static final
   - (1) 객체마다 저장되지 않고, 클래스에만 포함 -> static
   - (2) 한 번 초기값이 저장되면 변경할 수없다.-> static

   * 상수 명명 규칙
    - 특별하게 모두 대문자로 적는 것이 관례;
 */

public class Earth {
    static final double EARTH_RADIUS = 6400;
    //복잡한 초기화는 정적 블록에서 상수 선언할 수 있다.
    static final double EARTH_SURFACE_AREA;
    
    static{
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
