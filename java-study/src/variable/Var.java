package variable;
/*
자바에서는 클래스들을 패키지로 구성하여 관리한다.
패키지는 클래스들을 논리적으로 그룹화하고 네임스페이스를 제공하는 방법이다.
이렇게 패키징하면, Main.java 함수를 실행시켜도 패키지에 존재하는 모든 클래스를 실행시킨다.
 */

/*
변수(Variable)란?
수학에서 변수는 변하는 수이지만, 프로그래밍에서는 데이터을 저장할 수 있는 메모리 공간이고 데이터는 변경이 가능하다.
하나의 변수에 단 하나의 값만 저장이 가능하므로, 새로운 값을 저장하면 기존의 값을 없어진다.
변수는 data의 type에 따라 data가 저장될 공간의 크기와 저장 형식을 정의한 것이 data type(자료형)이다.
Data Type에서 표현에 대한 종류는 크게 정수형(int, short, byte, long), 실수형(float, double), 문자형(char), 논리형(boolean)으로 구분된다.
Data Type에서 저장 방식에 대한 종류는 Primitive Type(기본 타입)과 Reference Type(참조 타입)으로 구분된다.
정수형, 실수형, 문자형, 논리형은 Primitive Type 이고 나머지는 모두 Reference Type 이다.
Primitive Type은 실제 data를 저장하고, Reference Type는 data가 저장된 객체의 주소를 저장한다.
문자형인 char는 문자를 내부적으로 정수(Unicode)로 자장하기 때문에 정수형고 별반 다르지 않아, 정수형과 실수형과의 연산도 가능하다.
논리형인 boolean 다른 primitive type과의 연산은 불가능하다.
 */

public class Var {
    public static void main(String[] args) {
        /*
        int num: local variable (method 내에 존재하는 variable)
        변수 선언시, 변수의 type에 필요한 memory allocation, 변수 naming, 변수 초기값에 필요한 data를 저장한다.
        변수의 이름은 메모리 공간에 이름을 붙여주는 것이기 때문에, 절대로 중복될 수 없다.
        변수의 이름으로 해당 메모리 공간에 저장된 데이터를 읽을 수 있다.
         */
        char ch = 'd'; // [type] [naming] = [data] (= 대입연산자는 오른쪽 데이터를 왼쪽(변수 등)에 저장하라는 뜻)
        System.out.println(ch);

        int x = 10;
        int y = 20;
        String str = "sum=";

        // 문자열과 정수를 더하면 문자열이다.
        System.out.println(str + x + y); // sum=1020
        System.out.println(x + y); // 30

        /*
        아래 코드 실행시 에러 발생
        int num;
        System.out.println(num);

        Error description
        java: variable num might not have been initialized
        메모리 해제가 안된 메모리 공간을 할당 받을 수 있어, 변수 선언 후 초기화하지 않을시에 예상치 못한 값이 저장되어 있을수 있다.
        그 값을 garbage value(쓰레기값)이라고 한다. 따라서 변수를 사용전에 항상 초기화를 해야한다.
        자바에서는 이와 같은 상황을 방지하기 위해, 초기화 하지 않은 변수를 읽을시에 위와 같은 에러가 발생되도록 개발되었다.
        위의 에러는 컴파일시에 발생하여 class 파일로 변환되지 않는다.
         */
        int num;
        System.out.println(num);

        /*
        아래는 primitive type variable이며, type에 따른 byte 크기이다. (현재는 1byte는 8bit)
        boolean: 1 byte
        char: 2 byte
        byte: 1 byte
        short: 2 byte
        int: 4 byte (2^8/2 -> 음수, 0, 자연수 포함하면, 표현할 수 있는 정수의 범위는  2^7 ~ 2^7-1 이다.)
        long: 8 byte (2^63 ~ 2^63-1)
        float: 4 byte (소수점 7번째 자리수 까진 정확하게 계산 가능)
        double: 8 byte (float보다 메모리 공간 double, 소수점 15번째 자리수 까진 정확하게 계산 가능하여 float보다 정확하므로 더 많이 사용한다.)

        아래와 같이, int a = 10을 보면 고정한 값을 literal이라 한다. 따라서 변수의 값은 변하지만, literal 자체는 변하지 않는다.
        또한 int(정수형)은 가장 많이 사용되어, 4가지 타입이 존재한다.
        각 타입마다 저장할 수 있는 공간이 다르므로, 저장할 값의 범위에 맞는 타입을 선택하면 좋을 것이다.
        일반적으로 정수형에서는 int를 사용한다. 왜냐하면, CPU 친화적이기 때문이다.
        CPU 32bit 아키텍처에서는 4byte로 명령어가 표현되며, 64bit 아키텍처에서는 8byte로 표현된다.
        따라서 int형은 4yte로 한번에 CPU 명령어가 저장되거나, 두개의 CPU 명령어가 저장되어 효율적으로 처리할 수 있다.
        하지만 메모리 절약이 필요하다면, 메모리 공간 만큼 맞추서 타입을 지정하는 것이 좋겠다.
         */
        int a = 10;
        char b = 'a';
        double c = 3.14;
        float d = 3.14f;
        boolean e = true;

        /*
        String만 대문자 인데, 이는 class이다.
        class는 reference type이므로, Stack 영역의 변수는 Heap 영역에 저장되어있는 객체의 주소를 가리킨다.
        아래의 String str1와 같이 참조형 변수(Reference Type Variable)는 data가 저장된 객체의 주소를 저장한다.
        JVM은 자바 가상 메모리 이므로, JVM가 32/64bit에 따라 참조형 변수의 크기가 달라진다.
        여기서 32/64bit란 CPU가 한번에 처리할 수 있는 레지스터의 크기이다. 32bit일 경우에 참조형 변수의 크기는 4byte이고, 64bit일 경우에 8byte이다.

        CPU 내부 레지스터(Register) 기억장치 한번에 처리하는 레지스터 크기를 32bit, 64bit이란 것을 뜻한다.
        Physcial Register(실제 레지스터)중에서는 MAR(Meomory Address Register) 레지스터에 CPU가 데이터를 읽거나 쓰려는 메모리 주소를 일시적으로 저장한다.
        JVM의 메모리 구조에서 Stack에 참조형 변수의 메모리 주소가 저장되고, Heap 영역을 가리키고 있다. 따라서 스택 영역은 32나 64bit 단위로 분할된다.
         */
        String str1 = "hello";
        String str11 = "hello";
        String str2 = "halo";

        // 두 변수에는 객체의 주소가 저장되어 있어, 두 객체의 주소를 비교하는 것이다.
        // compare memory address (eqauls: compare string value)
        if (str1 == str2) {
            System.out.println("str1 == str2");
        } else  {
            System.out.println("str1 != str2");
        }

        // 동일한 문자열 리터럴이면 같은 객체를 참조할 수 있도록 문자열 풀(string pool)에 저장하여 주소가동일하다.
        if (str1 == str11) {
            System.out.println("str1 == str11");
        } else  {
            System.out.println("str1 != str11");
        }

        // new 연산자는 새로운 객체의 주소를 생성한다.
        // new 연산자를 통해 생성된 객체들은 동일한 문자열 리터럴일지라도 객체가 저장된 주소가 다르다.
        String newStr1 = new String("hello");
        String newStr2 = new String("hello");

        if (newStr1 == newStr2) { // 두 변수에는 객체의 주소가 저장되어 있어, 두 객체의 주소를 비교하는 것이다.
            System.out.println("newStr1 == newStr2");
        } else  {
            System.out.println("newStr1 != newStr2");
        }

        // Reference Type은 객체의 주소 또는 null을 값으로 가질 수 있다.
        // null은 어떠한 객체의 주소도 저장되지 않는다는 것을 뜻한다.
        newStr1 = null;
        System.out.println(newStr1);
    }
}
