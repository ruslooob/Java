import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MyClass {
    ArrayList<String> days = new ArrayList<>();

    MyClass() {
        days.add("Monday");
        days.add(1, "Tuesday");
        days.addAll(Arrays.asList("Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        /*
        * У ArrayList-а, в отличии от array
        * переопределен метод toString()
        *  */
        System.out.println(days);
        /*
        * Метод перегружен
        * */
        days.remove(0);
        days.remove("Tuesday");

        System.out.println(days);
        /*
        * Похожие методы
        * Один принимает индекс.
        * Другой принимает сам объект
        * */
        System.out.println(days.get(0));
        System.out.println(days.indexOf("Wednesday"));

        System.out.println(days.contains("Friday"));

        days.set(2, "FRIDAY");
        System.out.println(days);

        /*
        * Следующие 3 цикла делают одно и то же
        * */
        for (int i = 0; i < days.size(); i++) {
            System.out.print(days.get(i) + " ");
        }
        System.out.println();

        for (String day : days) {
            System.out.print(day + " ");
        }
        System.out.println();
        /*
        * Внутри forEach - лямбда-функция
        * */
        days.forEach(day -> System.out.print(day + " "));
        System.out.println();
        /*
        * Сортировка
        * */
        Collections.sort(days);
        System.out.println(days);

        /*
        * Очищаем массив
        * */
        days.clear();
        System.out.println(days);
    }

}
