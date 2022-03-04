package array;

public class Main {
  // объявление пустого массива
  int[] ints = new int[10];
  String[] str = new String[5];
  char[] chars = new char[10];

  // объявление инициализированного массива
  static int[] fibs = {1, 1, 2, 3, 5, 8, 13};
  static double[] constants = {3.14, 2.71};

  public static void main(String[] args) {

    for (int fib : fibs) {
      System.out.println(fib);
    }
    System.out.println(fibs);
    System.out.println("+++======");
    int[] anotherArr = fibs.clone();
    for (int elem : anotherArr) {
      System.out.println(elem);
    }

    anotherArr[0] = 1000;
    for (int elem : anotherArr) {
      System.out.println(elem);
    }
    System.out.println("==============================");
    for (int fib : fibs) {
      System.out.println(fib);
    }
  }
}
