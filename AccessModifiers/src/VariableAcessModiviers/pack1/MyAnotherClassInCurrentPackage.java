package VariableAcessModiviers.pack1;

public class MyAnotherClassInCurrentPackage {

    /**
     * Здесь у нас имеется доступ к 3 переменным
     * public, package(default), protected
    * */
    public int anotherSum() {
        MyClass myClass = new MyClass();
        return myClass.pub + myClass.pack + myClass.prot;
    }
}
