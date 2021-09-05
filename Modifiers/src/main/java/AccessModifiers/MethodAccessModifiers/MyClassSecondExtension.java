package AccessModifiers.MethodAccessModifiers;

public class MyClassSecondExtension extends MyClass {
    /**
     * Отнаследованный публичный метод может быть только публичным
     * */
    @Override
    public void pubMethod() {
        System.out.println("Public Method in extension class");
    }

    /**
     * Отнаследованным защищенный метод может быть как защищенным,
     * так и публичным.
     * В данном примере метод изменил свой модификатора доступа
     * на публичный.
     * */
    @Override
    public void protMethod() {
        System.out.println("Public Method in extension class");
    }
}
