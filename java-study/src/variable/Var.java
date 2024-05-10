package variable;
/*
자바에서는 클래스들을 패키지로 구성하여 관리한다.
패키지는 클래스들을 논리적으로 그룹화하고 네임스페이스를 제공하는 방법이다.
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
        `int num;`와 같이 method 내에 존재하는 변수(variable)를 지역 변수(local variable)라고 한다.
        왜 지역 라고 하는 것일까? method는 thread의 메모리 구조중에 스택(stack) 영역에 저장된다.
        thread 끼리의 공유 자원 영역(heap, code, data)과 thread 독립적 자원 영역(stack)이 존재한다.
        따라서 스택은 thread의 독립적인 저장 공간으로써, 지역 변수라고 불리는 것이다.

        변수 선언시, 변수의 type에 필요한 메모리 공간 할당과 변수 네이밍을 한다.
        변수의 이름은 메모리 공간에 이름을 붙여주는 것이기 때문에, 절대로 중복될 수 없다.
        변수의 이름으로 해당 메모리 공간에 저장된 데이터를 읽을 수 있다.
         */
        int num;
        char ch = 'd'; // [type] [naming] = [data] (= 대입연산자는 오른쪽 데이터를 왼쪽 변수에 저장하라는 뜻)
        System.out.println(ch);

        int x = 10;
        int y = 20;
        String str = "sum=";
        // 문자열과 정수를 더하면 문자열이다.
        System.out.println(str + x + y); // sum=1020
        System.out.println(x + y); // 30
        /*
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
        String만 대문자 인데, 이는 class이다. 허나 char 배열과 같은 뜻이며, 문자를 나열한 것이다.
        C언어는 char 배열으로만 문자열을 표현하지만, 문자열은 개발할때 아주 빈번히 쓰임으로 자바에서는 String을 클래스로 만들어 여러 기능(메소드)를 추가하였다.
        class는 reference type이므로, Stack 영역의 변수는 Heap 영역에 저장되어있는 객체의 주소를 가리킨다.
        아래의 String str1와 같이 참조형 변수(Reference Type Variable)는 data가 저장된 객체의 주소를 저장한다.
        JVM은 자바 가상 머신 이므로, JVM이 32/64bit에 따라 참조형 변수의 크기가 달라진다.
        여기서 32/64bit란 CPU가 한번에 처리할 수 있는 레지스터의 크기이다. 32bit일 경우에 참조형 변수의 크기는 4byte이고, 64bit일 경우에 8byte이다.

        CPU 내부 기억장치인, 레지스터(Register)  한번에 처리하는 레지스터 크기를 32bit, 64bit이란 것을 뜻한다. 한번에 처리 할 수 있는 데이터의 크기를 'word'라고 표현하며, arm64의 경우에는 word가 64bit이다.
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