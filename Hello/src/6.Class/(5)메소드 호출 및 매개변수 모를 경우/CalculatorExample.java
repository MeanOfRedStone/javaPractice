/*
 * 메소드 호출 방법
  -> 매개 변수 사용과 비슷. 생성된 객체에 '.'을 붙여 사용
 */

public class CalculatorExample {
    public static void main(String[] args){
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 =myCalc.plus(5, 6);
        System.out.println("result 1 : " + result1);

        byte x = 10;
        byte y = 4;
        
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();
    }    
}
