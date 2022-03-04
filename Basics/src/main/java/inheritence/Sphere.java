package inheritence;

// extends - наследование свойств и методов от другого класса
public class Sphere extends SolidOfRevolution {

  public Sphere(double radius) {
//    super - обращению к объекту - родителю
    super(radius);
  }

  // override явно показывает, что мы хотим переопределить метод базового класса
  // override - не обязательная аннотация
  @Override
  public double getVolume() {
    return 4./3 * Math.PI * Math.pow(super.radius, 3);
  }
}
