/* 
 * 1. 매개변수의 수를 모를 경우
    (1) 배열 타입 선언
    (2) ... 선언
*/

public class Computer {
    int sum1(int[] values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}
