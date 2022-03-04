package inheritence;

//абстрактная сущность, представляющая тело вращения
//класс может называться абстрактным, если таковым является хотя бы один его метод
public abstract class SolidOfRevolution implements Printable {
  // protected - модификатор для поля, которое доступно только для потомков
  protected double radius;

  // конструктор (метод, который вызывается, когда мы создаем
  // экземпляр класса через ключевое слово new)
  public SolidOfRevolution(double radius) {
    this.radius = radius;
  }

  @Override
  public void print() {
    System.out.printf("SolidOfRevolution with radius %f and volume %f\n", this.radius, getVolume());
  }

  //геттер - получатель значения поля,
  // если вы хотите получить значение радиуса, то вызовите этот метод
  public double getRadius() {
    return radius;
  }
  //сеттер - установщик значения поля,
  // если хотите изменить значение поля radius, нужно воспользоваться этим методом
  public void setRadius(double radius) {
    this.radius = radius;
  }

  //абстрактный метод, который обязан переопределить потомок
  public abstract double getVolume();
}
