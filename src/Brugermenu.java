import java.util.Scanner;
// en brugermenu som kører på repeat indtil brugeren ikke skal bruge det mere
public class Brugermenu {
    public static void main(String[] args) {
        Udregninger mainUdregner = new Udregninger();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Miks calculator");
        System.out.println("What would u like to do +, -, /, *, secret or stop?");
        String whatToDo = input.next();

        while (whatToDo != "stop") {
            if (whatToDo.equals("+")) {
                System.out.println("type 2 numbers u want to add together");
                int firstNumber = input.nextInt();
                int secondNumber = input.nextInt();
                System.out.println("The result is " + mainUdregner.sum(firstNumber, secondNumber));
                whatToDo = input.next();
            } else if (whatToDo.equals("-")) {
                System.out.println("type 2 numbers u want to add together");
                int firstNumber = input.nextInt();
                int secondNumber = input.nextInt();
                System.out.println(mainUdregner.minus(firstNumber, secondNumber));
                whatToDo = input.next();
            } else if (whatToDo.equals("/")) {
                System.out.println("type 2 numbers u want to add together");
                int firstNumber = input.nextInt();
                int secondNumber = input.nextInt();
                System.out.println(mainUdregner.dele(firstNumber, secondNumber));
                whatToDo = input.next();
            } else if (whatToDo.equals("*")) {
                System.out.println("type 2 numbers u want to add together");
                int firstNumber = input.nextInt();
                int secondNumber = input.nextInt();
                System.out.println(mainUdregner.multiplicere(firstNumber, secondNumber));
                whatToDo = input.next();
            } else if (whatToDo.equals("secret")) {
                System.out.println("type 2 numbers u want to add together");
                int firstNumber = input.nextInt();
                int secondNumber = input.nextInt();
                System.out.println(mainUdregner.secret(firstNumber, secondNumber));
                whatToDo = input.next();
            } else if (whatToDo.equals("stop")) {
                break;
            } else {
                System.out.println("Incorrect option, please try again");
                System.out.println("What would u like to do +, -, /, *, secret or stop?");
                whatToDo = input.next();
            }
        }

    }
}
