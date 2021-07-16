package finalpack;

/*
* final-класс нельзя наследовать
* */
public final class MyClass {
    /*
    * Примитивная переменная, нельзя ничего менять
    * */
    private final int integer;
    /*
    * Ссылочная переменная, нельзя менять только ссылку,
    * само состояние менять можно
    * */
    private final String str;

    MyClass(int integer, String str) {
        this.integer = integer;
        this.str = str;
        /*
        * смена состояния
        * */
        str += "Hello";
    }

    /*
    * final-метод нельзя переопределить при наследовании
    * */
    public final int method() {
        return 1;
    }

}

