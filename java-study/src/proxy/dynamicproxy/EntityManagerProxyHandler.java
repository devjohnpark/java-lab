package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EntityManagerProxyHandler implements InvocationHandler {
    private EntityManager realEntityManager;

    // 프록시 객체는 EntityManager의 모든 메서드가 호출될 때마다 EntityManagerProxyHandler(InvocationHandler)의 invoke 메서드가 실행된다.
    // Parameter: 프록시 객체(EntityManager의 프록시 객체), 프록시 객체의 호출된 메서드(persist)의 메타데이터를 포함한 Method 객체, 메서드에 전달할 매개변수(entity)
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[실제 구현체의 메서드 호출 전 작업 수행]");
        Object result = null;
        if (realEntityManager == null) {
            // EntityManager 구현체 동적 생성
            realEntityManager = new RealEntityManager();
            System.out.println("새로운 EntityManger 구현체 생성");
        }

        // Reflection API(java.lang.reflect.Method)를 사용하여 realEntityManager 객체의 메서드를 동적으로 호출이 가능하다.
        // method: java.lang.reflect.Method 객체로, 호출하려는 메서드 정보(메서드명, 파라미터 타입, 반환 타입 등)을 포함를 나타낸다.
        // method 객체(JVM의 Method Area에서 RealEntityManager 클래스의 메타데이터)를 사용하여 호출할 메서드를 런타임에 결정가능하다.
        System.out.println("[실제 구현체의 메서드 호춣]");

        try {
            result = method.invoke(realEntityManager, args); // 메서드 실행 결과를 result 변수에 저장
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (method.getName().equals("clear")) {
            realEntityManager = null;
        }

        System.out.println("[실제 구현체의 메서드 호출 후 작업 수행]");
        return result; // realEntityManager 객체의 메서드 실행 결과 반환
    }

    /*
    Java의 reflection을 사용하여 JVM에서 클래스의 메타데이터에 접근하고 조작하여 프록시 객체를 동적으로 생성
    Reflection은 런타임에 클래스나 인터페이스의 메타데이터(클래스, 메서드, 필드, 애노테이션 등)에 접근하고 조작할 수 있는 자바의 기능이다.

    클래스가 자신의 메터데이터를 보는 것을 의미하여 reflection(반사)라고한다.

    예를들어, EntityManager 프록시 객체를 생성할때, EntityManager 인터페이스와 InvocationHandler 인터페이스의 구현체를 인자로 넘긴다.
    이로써, EntityManager 구현체의 Proxy 객체가 동적으로 생성되고, EntityManager 구현체의 메서드를 동적으로 호출하고 메서드 전후로 로직을 추가할수 있다.
    이는 EntityManager 구현체의 여러 메서드의 호출 전후로 동일한 로직을 추가할때 중복을 제거할수 있다. (특정 인터페이스를 구현한 모든 객체의 기능을 감싼 효과)

    Reflection API(java.lang.reflect.Proxy)를 사용하여, EntityManager 인터페이스를 구현한 Proxy 객체 동적 생성이 가능하다.
    1. 구현해야될 인터페이스와 이를 로드할 클래스 로더를 지정한다.

    Reflection API(java.lang.reflect.InvocationHandler)를 사용하여, 프록시 객체의 메서드를 동적으로 호출하도록 핸들링이 가능하다.
    2. 프록시 객체에서 호출된 메서드를 실제 메서드(EntityManager 구현체의 메서드)를 동적으로 호출하도록 핸들링하는 InvocationHandler 구현체 생성한다. 이 구현체에서 프록시 객체의 메서드 호출을 가로채서 로직을 처리하는 invoke 메서드를 구현할수 있다.
    3. 프록시 객체에서 메서드 호출시마다 InvocationHandler 인터페이스의 invoke 메서드가 호출되기 위해서, 프록시 객체 생성할때 인자로 InvocationHandler 구현체를 넘긴다.
    4. 프록시 객체는 실제 메서드를 동적으로 호출되므로 JVM에서 이 호출을 InvocationHandler(인터페이스 구현체의 메서드 호출 핸들러)의 invoke 메서드로 전달한다. (java.lang.reflect.ProxyGenerator)
        // generateMethod` 메서드에서 동적 프록시 객체에서 구현된 모든 인터페이스 메서드에 `invoke` 메서드 호출 코드를 삽입하는 코드가 작성되어있다.
        private void generateMethod(ClassWriter cw, String className) {
            MethodType mt = MethodType.methodType(returnType, parameterTypes);
            String desc = mt.toMethodDescriptorString();
            int accessFlags = ACC_PUBLIC | ACC_FINAL;
            if (method.isVarArgs()) accessFlags |= ACC_VARARGS;

            MethodVisitor mv = cw.visitMethod(accessFlags,
                    method.getName(), desc, null,
                    typeNames(Arrays.asList(exceptionTypes)));
            // ...
            mv.visitMethodInsn(INVOKEINTERFACE, JLR_INVOCATION_HANDLER,
                    "invoke",
                    "(Ljava/lang/Object;Ljava/lang/reflect/Method;" +
                            "[Ljava/lang/Object;)Ljava/lang/Object;", true);
            // ...
        }
     */

//    // RealEntityManager 객체 null값 설정을 위한 메서드
//    public void releaseEntityManager() {
//        realEntityManager.clear();
//        realEntityManager = null;
//        System.out.println("EntityManager 객체 null 설정 완료");
//    }
}