# Class Access Modifiers

Представьте такую картину:

![](https://docs.oracle.com/javase/tutorial/figures/java/classes-access.gif)

Модификатор класса позволяет нам управлять видимостью класса в нашем коде.   

|  Modifier   | Alpha  | Beta | AlphaSub | Gamma |
|:-----------:|:------:|:----:|:--------:|:-----:|
| public      |    +   |   +  |     +    |   +   |
| no modifier |    +   |   +  |     -    |   -   |


### Пояснение
* Классы, объявленные с модификатором public видны отовсюду.
* Классы, не помеченные никаким из модификаторов видны только на уровне пакета
* Нет смысла объявлять класс как protected, потому что он будет аналогичен default-модификатору класса
[Why cant we declare class as protected in Java?](https://www.quora.com/Why-cant-we-declare-class-as-protected-in-Java)
* Нет смысла объявлять класс как pivate, потому что он не будет доступен нигде в коде.
[Why a java class can not be private or protected](https://www.programmingmitra.com/2016/10/why-a-java-class-can-not-be-private-or-protected.html)

### Resources
* [Docs Oracle. Controlling Access to Members of a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)