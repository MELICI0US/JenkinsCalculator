import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to the calculator");
    Calculator calc = new Calculator();
    int a, b;
    String operation;
    Scanner S = new Scanner(System.in);

    do {
      System.out.print("Enter a command: ");

      operation = S.next();

      if (operation.equals("add")) {
        a = S.nextInt();
        b = S.nextInt();

        System.out.println(calc.add(a, b));
      }

      if (operation.equals("subtract")) {
        a = S.nextInt();
        b = S.nextInt();
        System.out.println(calc.subtract(a, b));
      }
      if (operation.equals("multiply")) {
        a = S.nextInt();
        b = S.nextInt();
        System.out.println(calc.multiply(a, b));
      }

      if (operation.equals("divide")) {
        a = S.nextInt();
        b = S.nextInt();
        System.out.println(calc.divide(a, b));
      }
      if (operation.equals("fibbonacci")) {
        a = S.nextInt();
        System.out.println(calc.fibonacciNumberFinder(a));
      }
      if (operation.equals("binary")) {
        a = S.nextInt();
        System.out.println(calc.intToBinaryNumber(a));
      }

    } while (!operation.equals("stop"));
  }
}
