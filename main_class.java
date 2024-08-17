package Java_Calculator;
import java.util.Scanner;
import java.lang.Math;
public class main_class {
    public static void main(String[] args) {
        System.out.println(" Java Console Calculator");
        Scanner in = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        boolean continueCalc = true;
        while (continueCalc) {
            System.out.print("Enter the first number: ");
            int  num1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int  num2 = in.nextInt();
            System.out.print("Choose the operator: ");
            int operator = in.nextInt();
            double r = 0;
            switch (operator) {
                case 1:
                    r = num1 + num2;
                    break;

                case 2:
                    r = num1 - num2;
                    break;

                case 3:
                    r = num1 * num2;
                    break;

                case 4:
                    if (num2 != 0) {
                        r = num1 / num2;
                    } else
                        System.out.println("Cannot divide by zero");
                    break;

                case 5:
                    if (num2 != 0)
                        r = num1 % num2;
                    else
                        System.out.println("Cannot be done by zero");
                    break;

                case 6:
                    r = Math.pow(num1, num2);
                    break;

                default:
                    System.out.println("You entered invalid operator");
            }

            System.out.println("Result is: " + r);
            System.out.println("Do you want to continue?(yes/no):  ");
            String choice = in.next();
            if (!choice.equals("yes")) {
                continueCalc= false;
            }

        }
        System.out.println("Calculator program ended");
    }
}





