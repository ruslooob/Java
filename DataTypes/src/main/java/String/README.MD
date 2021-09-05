# [String](https://github.com/ruslooob/Java/tree/main/DataTypes/src/String/Self), [StringBuffer](https://github.com/ruslooob/Java/tree/main/DataTypes/src/String/StringBuffer), [StringBuilder](https://github.com/ruslooob/Java/tree/main/DataTypes/src/String/StringBuilder)

|                    |     String      | StringBuffer | StringBuilder |
|:------------------:|:---------------:|:------------:|:-------------:|
|    Изменяемость    | Immutable (нет) | Mutable (да) |  Mutable (да) |   
|    Расширяемость   |   final (нет)   |   final (нет)   |   final (нет)   |
| Потокобезопасность | Да, за счет <br> неизменяемости | Да, за счет синхронизации | Нет |
| Когда использовать |При работе со строками, которые редко будут модифицироваться| При работе со строками, которые часто будут модифицироваться в многопоточной среде | При работе со строками, которые часто будут модифицироваться, в однопоточной среде |

У этих 3 классов очень много методов, совсем не обязательно запоминать их все, главное знать, что они существуют и где их можно найти

### Resources
* [Javarush. Знакомство со String, StringBuffer и StringBuilder в Java](https://javarush.ru/groups/posts/2351-znakomstvo-so-string-stringbuffer-i-stringbuilder-v-java#%D0%9A%D0%BB%D0%B0%D1%81%D1%81-String)
* [Docs.Oracle. Class String](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html)
* [Docs.Oracle. Class StringBuffer](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuffer.html)
* [Docs.Oracle. Class StringBuilder](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html)