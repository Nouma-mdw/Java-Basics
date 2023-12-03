public class Calculator {
  int num_1;
  int num_2;

  // defining constructur
  public Calculator() {
  }
  // defining method for addition
  public int add(int num_1, int num_2) {
    return num_1 + num_2;
  }
  // defining method for subtraction
  public int subtract(int num_1, int num_2) {
    return num_1 - num_2;
  }
  // defining method for multiplication
  public int multiply(int num_1, int num_2) {
    return num_1 * num_2;
  }
  // define method for division
  public int divide(int num_1, int num_2) {
    return num_1 / num_2;
  }
  // defining method for modulo
  public int modulo(int num_1, int num_2) {
    return num_1 % num_2;
  }
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println("Adding the numbers 5 adn 7 results in " +myCalculator.add(5,7));
    System.out.println("Subtracting from 45 the number 11 results in " + myCalculator.subtract(45,11));
    System.out.println("The division of 72 by 13 returns as the next integer " + myCalculator.divide(72,13));
    System.out.println("The remaining of that calculation is " + myCalculator.modulo(72,13));

  }
}