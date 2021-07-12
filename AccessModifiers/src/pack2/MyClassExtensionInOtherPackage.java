package pack2;

import pack1.MyClass;

/**
 * Здесь уже у нас доступ к 3 переменным
 * К protected-переменной доступ получается
 * через ключевое слово super
* */
public class MyClassExtensionInOtherPackage extends MyClass {
    public int extensionSum() {
        MyClass myClass = new MyClass();
        return myClass.pub + super.prot;
    }
}
