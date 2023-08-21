package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.*;


public class Car {
    //필드
    //Engine 클래스 객체 생성 -> import 해주었기 때문에 간단하게 클래스만 적어줌
    Engine engine = new Engine();
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();

    //Tire 클래스는  두 패키지에 모두 있기 때문에 패키지 이름과 함께 전체 이름이 기술되어야 한다.
    sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
    sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
    
}
