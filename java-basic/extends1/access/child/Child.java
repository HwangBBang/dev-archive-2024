package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;    // pulbic 이라 가능
        protectedValue = 1; // 상속 관계 이거나 같은 패키지면 가능
        //defaultValue = 1; // 다른 패키지이기에 접근 불가
        //privateValue = 1; // private이라 접근 불가


        publicMethod();
        protectedMethod(); // 상속 관계 이거나 같은 패키지면 가능
        //defaultMethod();
        //privateMethod();

        printParent();
    }
}
