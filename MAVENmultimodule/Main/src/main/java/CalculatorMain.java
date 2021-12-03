import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Operations objOperations = new Operations();

        boolean recurring = true;

        while (recurring) {
            System.out.println("\t Enter First Number : ");
            int firstNumber = input.nextInt();

            System.out.println("\t Enter Second Number : ");
            int secondNumber = input.nextInt();

            System.out.println("\t Choose the Following Operation:-\n\t\t" +
                    "1. Addition\n\t\t" +
                    "2. Subtraction\n\t\t" +
                    "3. Multiplication\n\t\t" +
                    "4. Division\n\n\t\t" +
                    "#Choose any other number for exit.");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    objOperations.performAddition(firstNumber, secondNumber);
                    break;

                case 2:
                    objOperations.performSubtraction(firstNumber, secondNumber);
                    break;

                case 3:
                    objOperations.performMultiplication(firstNumber, secondNumber);
                    break;

                case 4:
                    objOperations.performDivision(firstNumber, secondNumber);
                    break;

                default:
                    System.out.print("#Program is Terminated");
                    recurring = false;
                    continue;
            }
            System.out.println("\n\n #You want to perform another Operation? PRESS (Y/N)");
            String yesOrNo = input.next();

            if (yesOrNo.charAt(0) == 'n') {
                recurring = false;
            }
        }
    }
}
