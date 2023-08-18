public class CarExample {
    public static void main(String[] args){
        //생성자 1 선택
        Car car1 = new Car();
        System.out.println("car1의 company : " + car1.company);
        System.out.println();
        
        //생성자 2 선택
        Car car2 = new Car("자가용");
        System.out.println("car2의 company : " + car2.company);
        System.out.println("car2의 model : " + car2.model);
        System.out.println();

        //생성자 3 선택
        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3의 company : " + car3.company);
        System.out.println("car3의 model : " + car3.model);
        System.out.println("car3의 color : " + car3.color);
        System.out.println();

        //생성자 4 선택
        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4의 company : " + car4.company);
        System.out.println("car4의 model : " + car4.model);
        System.out.println("car4의 color : " + car4.color);
        System.out.println("car4의 maxSpeed : " + car4.maxSpeed);
        System.out.println();
    }
}
