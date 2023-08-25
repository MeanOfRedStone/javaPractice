/*
 * 어노테이션(Annotation)은 메타 데이터(metadata)이다.
    -메타데이터란 :  애플리케이션이 처리해야 할 데이터가 아니라, 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지를 
                    알려주는 정보이다.
 
 *어노테이션 형태
    -@AnnotationName

 *어노테이션의 용도
 (1) 컴파일러에게 코드 문법 에러를 체크하도록 정보를 제공
 (2) 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공
 (3) 실행 시(런타임 시) 특정 기능을 실행하도록 정보를 제공

 */

 /*
  <6.15.1. 어노테이션 타입 정의와 적용> 
  *어노테이션 타입 정의와 적용
    - element를 멤버로 갖는다.
    예) 선언
    public @interface AnnotationName{
        String elementName1();
        int elementName2() default 5;
    }

    예) 적용
    @AnnotationName(elementName1 = "값", elementName2=3);
  */

/*
 <6.15.2 어노테이션 적용 대상>
 *어노테이션 적용 대상 지정
 @Target(ElementType.TYPE, ElementType.FIELD, ElementType.METHOd)
 public @interface AnnotationName{
}
 */

/*
 <6.15.3 어노테이션 유지 정책>
 *RetentionPolicy 
 사용 용도에 따라 어느 범위까지 유지할 것인지 지정해야 한다.
 범위 : 소스 , 컴파일된 클래스, 런타임 시 유지
 */

/*
<6.15.4 런타임 시 어노테이션 정보 사용하기>
*리플렉션 : 어노테이션의 적용 여부, 엘리먼트 값을 읽고 적절히 처리할 수 있다.
예) 클래스에 적용된 어노테이션 정보 얻을 때
Field[]  |   getFields() |   필드 정보를 Field 배열로 리턴
Constructor[]   |   getConstructors()   |   생성자 정보를 Constructor 배열로 리턴
Method[]    |   getDeclareMethods() |   메소드 정보를 Method 배열로 리턴

예) 각 클래스 필드 생성자 메소드가 가진 어노테이션 정보 얻을 때
Annotation  |   getAnnotation(Class<T> annotationClass) | 지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴하고 그렇지 않으면 null을 리턴한다. ...
...
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // Target은 메소드에만 적용
@Retention(RetentionPolicy.RUNTIME) // 런타임 시까지 어노테이션 정보를 유지
public @interface PrintAnnotation {
    //각 메소드의 실행 내용을 구분선으로 분리해서 콘솔에 출력하도록 하는 PrintAnnotation
    String value() default "-";
    int number() default 15;
}
