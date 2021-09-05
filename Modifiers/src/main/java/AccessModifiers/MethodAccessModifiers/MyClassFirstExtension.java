package AccessModifiers.MethodAccessModifiers;

public class MyClassFirstExtension extends MyClass {
    /**
     * Отнаследованный публичный метод может быть только публичным
     * */
    @Override
    public void pubMethod() {
        System.out.println("Public Method in Extension Class");
    }

    /**
     * Отнаследованным защищенный метод может быть как защищенным,
     * так и публичным.
     * В данном примере метод не изменил своего модификатора доступа
     * */
    @Override
    protected void protMethod() {
        System.out.println("Protected Method in Extension Class");
    }


}
