package MethodAccessModifiers;

public abstract class MyClass {
    /**
     * Для публичных и защищенных методов
     * реализация по-умолчанию не обязательна
     * */
    public abstract void pubMethod();
    protected abstract void protMethod();

    /**
     * У приватного метода обязательно должна быть реализация
     * */
    private void privMethod() {
        System.out.println("Private method");
    }
}
