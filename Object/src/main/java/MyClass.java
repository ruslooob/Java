import java.util.Objects;

public class MyClass implements Cloneable {
    private final int a;
    private final int b;
    private final int c;

    public MyClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*
     * Методы hashCode & equals нужны для
     * правильного сравнения объектов класса.
     *
     * Сами эти методы вы практически не будете вызывать,
     * но они активно вызываются сторонним кодом, который пользуется
     * сравнением в своей реализации.
     * */

    /*
     * Вернет хэш код, который высчитывается
     * на основе всех атрибутов исходного класса.
     * С очень большой вероятностью классы, у которых равны
     * хэш-коды будут равными. Но все-таки есть вероятность,
     * что разные объекты будут иметь одинаковые хэш-коды.
     * Такой случай называют коллизией.
     * */
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    /*
     * Как раз для этого и придумали метод equals,
     * который точно ответит на вопрос:
     * равны ли объекты класса или нет.
     *
     * Может возникнуть вопрос: зачем нужно 2 метода, если equals
     * итак прекрасно работает?
     *
     * Ответ: hashCode работает намного быстрее, а шанс
     * коллизий очень мал. Если же во время сравнений у объектов
     * будет равный хэш-код, то после него сразу же будет вызван
     * метод equals, чтобы подтвердить это равенство.
     *
     * Таким образом достигается максимальная скорость и стабильность
     * работы операции сравнения объектов
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return a == myClass.a &&
                b == myClass.b &&
                c == myClass.c;
    }


    protected Object clone(int a, int b, int c) {
        return new MyClass(a, b, c);
    }

    /*
    * Вернет объект этого класса
    * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
    * Вызывается, когда нужно напечатать
    * или сложить что-то со строкой
    * */
    @Override
    public String toString() {
        return String.valueOf(this.a) + String.valueOf(this.b) + String.valueOf(this.c);
    }

    /*
    * Вызывается перед тем, как объект будет уничтожен
    * */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("hello world");
    }
}
