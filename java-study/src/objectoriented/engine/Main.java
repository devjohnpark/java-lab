package objectoriented.engine;

import objectoriented.objectconcept.Computer;
import objectoriented.objectconcept.Person;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(10, Tire.금호타이어);
        wheel1.changeTire(Tire.한국타이어);

        Wheel wheel2 = new Wheel(100, Tire.미쉐린타이어);

        System.out.println(wheel1);
        System.out.println(wheel2);
        System.out.println("address is equal?" + (wheel1 == wheel2)); // false

        // 기존의 wheel2가 참조하고 있던 인스턴스는 더 이상 사용 불가능
        // 인스턴스가 참조가 되고 있지 않으면, 가비지 컬렉터에 의해서 자동으로 메모리에서 제거된다.
        wheel2 = wheel1;
        System.out.println("address is equal?" + (wheel1 == wheel2)); // true
        System.out.println(wheel1.getWheelRadius());
        System.out.println(wheel2.getWheelTire());

        // Wheel 타입의 인스턴스 3개를 저장할수 있는 공간 생성
        // 아직 Wheel 인스턴스를 생성한 것이 아니라, Wheel 인스턴스를 참조하기 위한 3개의 참조변수들이 만들어져 배열로 묶인 것이다.
        // 배열 요소의 각 참조 변수는 인스턴스의 주소가 저장된다.
        Wheel[] wheels1 = new Wheel[3];

        System.out.println(wheels1[0]); // null
        System.out.println(wheels1[1]); // null

        // 각 배열 요소에 인스턴스 생성
        wheels1[0] = new Wheel(5, Tire.한국타이어);
        wheels1[1] = new Wheel(10, Tire.금호타이어);
        wheels1[2] = new Wheel(100, Tire.미쉐린타이어);

        for (Wheel wheel : wheels1) {
            System.out.printf("raridus: %f, tire: %s\n", wheel.getWheelRadius(), wheel.getWheelTire());
        }

        Wheel[] wheels2 = { new Wheel(5, Tire.한국타이어), new Wheel(10, Tire.금호타이어), new Wheel(100, Tire.미쉐린타이어) };

        for (Wheel wheel : wheels2) {
            System.out.printf("raridus: %f, tire: %s\n", wheel.getWheelRadius(), wheel.getWheelTire());
        }

        // 인스턴스 참조변수 배열 선언과 생성
        Wheel[] wheels = new Wheel[4];

// 인스턴스 선언과 생성 및 배열의 참조변수 요소에 각각 저장
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(50, Tire.한국타이어);
        }

        //        Java의 향상된 for문은 배열을 요소 값을 변수(wheel)에 저장한다. 따라서 배열의 요소를 직접 수정 불가능
//        for (Wheel wheel : wheels) {
//            wheel = new Wheel(50, Tire.한국타이어);
//        }

        Engine engine = new GasolineEngine(500);

        Car car = new Car(Manufacturer.MERCEDES_BENZ, engine, wheels);
        car.displayInfo();


//        Car car = new Car(Manufacturer.BMW, );
//        // Car car; // 클래스 객체를 참조하기 위한 변수 선언
//        // car = new Car(); // 클래스 객체 생성 후, 객체의 주소 변수에 저장
//
//        car.engine = new GasolineEngine(200);
//        car.wheels = wheels;
//        car.printInfo();
//
//        Car car1 = new Car();
//        Car car2 = new Car();
//        car1 = car2;
//        System.out.println(VariablesMethods.classVariable);
//        VariablesMethods vm = new VariablesMethods();
//        VariablesMethods.classVariable = 100;
//        System.out.println(vm.classVariable);
//        VariablesMethods.classMethod();


        // Computer 객체 생성
        Computer computer = new Computer("M1 Macbook Pro");

        // Person 객체 생성
        Person person = new Person("John");

        // Person 객체에 Computer 객체 관계(참조) 형성
        person.setComputer(computer);

        // 계산식 정의
        int operand1 = 10;
        int operand2 = 5;
        char operator = '+';

        // Computer 객체에게 계산식 주고 결과값 반환받기
        int result = person.getCalculatedValue(operand1, operand2, operator);

        // 결과 출력
        System.out.println("Result: " + result);



//        VariablesMethods.classMethod(); // 인스턴스 생성 없이 실행 가능
//        VariablesMethods variablesMethods = new VariablesMethods();
//        variablesMethods.instanceMethod();
//        System.out.println(variablesMethods.instanceVariable);
//        char[] arr = variablesMethods.hello();

//        System.out.println(arr);


    }
}
