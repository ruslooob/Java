package loops;

public class Main {

  public static void main(String[] args) {
    //for loop
    for (int i = 0; i < 10; i++) {
      System.out.printf("i=%d\n", i);
    }
    //while loop
    System.out.println("===================");
    int i = 0;
    while(i < 10) {
      System.out.printf("i=%d\n", i);
      i++;
    }
    //do while loop
    System.out.println("===================");
    i = 0;
    do {
      System.out.printf("i=%d\n", i);
      i++;
    } while(i < 10);
  }

}
