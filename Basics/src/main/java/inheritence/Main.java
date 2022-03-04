package inheritence;

public class Main {

  public static void main(String[] args) {
    // обратите внимание, слева мы указали общий класс(SolidOfRevolution),
    // а справа - его наследника(класс Sphere)
    SolidOfRevolution solidOfRevolution = new Sphere(20);
    solidOfRevolution.print();
  }
}
