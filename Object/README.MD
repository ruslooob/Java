# Object

По-умолчанию считается прародителем всех классов. Поэтому ссылочная переменная типа Object может ссылаться на объект любого класса.

В классе Object определены следующие методы:

|  Метод   | Назначение | 
|:-----------:|:------:|
| Object clone() | Создает новый объект аналогичный клонируемому объекту |
| boolean equals(Object o) | Определяет равнозначность объектов |  
| void finalize() **Deprecated** | Вызывается перед тем, как неиспользуемый объект будет удален сборщиком мусора (**Не рекомендуется**) |
| Class<?> getClass() | Определяет класс объекта во время выполнения |
| int hashCode() | Возвращает хеш-код, связанный с вызывающим объектом |
| void notify() | Возобновляет работу потока, ожидающего уведомления от вызывающего объекта |
| void notifyAll() | Возобновляет работу всех потоков, ожидающих уведомления от вызывающего объекта |
| String toString() | Возвращает символьную строку, описывающую объект |
| void wait() | Ожидает выполнение другого потока |
| void wait(long milliseconds) | Ожидает выполнение другого потока |
| void wait(long milliseconds, int nanoseconds) | Ожидает выполнение другого потока | 

### Resources 
* [Object и его методы](https://metanit.com/java/tutorial/3.9.php)
* [Все методы класса Object, метод toString()](https://javarush.ru/quests/lectures/questmultithreading.level01.lecture03)
* [Методы equals & hashCode: зачем, где используются, как работают](https://javarush.ru/quests/lectures/questmultithreading.level01.lecture04?post=full)
* [Контракты equals и hashCode или как оно всё там](https://javarush.ru/groups/posts/1989-kontraktih-equals-i-hashcode-ili-kak-ono-vsje-tam)
* [Метод clone, интерфейс Cloneable](https://javarush.ru/quests/lectures/questmultithreading.level01.lecture07)
* [Docs.Oracle Class Object](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Object.html)





