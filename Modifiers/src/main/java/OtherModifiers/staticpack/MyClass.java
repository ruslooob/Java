package OtherModifiers.staticpack;

public class MyClass {
    /*
    * Статическая переменная
    * */
    public static int var = 100;

    /*
    * Статический метод
    * не может работать с нестатическими переменными
    * */
    public static int getVar() {
        return var;
    }

    /*
    * Статический класс
    * */
    public static class MyStaticClass {

    }
}
