import java.util.Scanner;
//brugermenu som kører i loop indtil brugeren skriver stop
public class Main {
      public static void main(String[] args) {
            Udregninger mainUdregner = new Udregninger();

            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Mik's calculator");
            System.out.println("What would you like to do now: +, -, /, *, secret or stop?");
            String whatToDo = input.next();

            while (whatToDo != "stop") {
                  if (whatToDo.equals("+")) {
                        System.out.println("type 2 numbers you want to add together");
                        int firstNumber = input.nextInt();
                        int secondNumber = input.nextInt();
                        System.out.println("The result is " + mainUdregner.sum(firstNumber, secondNumber));
                        System.out.println("What would you like to do now: +, -, /, *, secret or stop?");
                        whatToDo = input.next();
                  }
                  else if (whatToDo.equals("-")) {
                        System.out.println("type 2 numbers you want to deduct");
                        int firstNumber = input.nextInt();
                        int secondNumber = input.nextInt();
                        System.out.println(mainUdregner.minus(firstNumber, secondNumber));
                        System.out.println("What would you like to do now: +, -, /, *, secret or stop?");
                        whatToDo = input.next();
                  }
                  else if (whatToDo.equals("/")) {
                        System.out.println("type 2 numbers you want to divide");
                        int firstNumber = input.nextInt();
                        int secondNumber = input.nextInt();
                        System.out.println(mainUdregner.dele(firstNumber, secondNumber));
                        System.out.println("What would you like to do now: +, -, /, *, secret or stop?");
                        whatToDo = input.next();
                  }
                  else if (whatToDo.equals("*")) {
                        System.out.println("type 2 numbers you want to multiply");
                        int firstNumber = input.nextInt();
                        int secondNumber = input.nextInt();
                        System.out.println(mainUdregner.multiplicere(firstNumber, secondNumber));
                        System.out.println("What would you like to do now: +, -, /, *, secret or stop?");
                        whatToDo = input.next();
                  }
                  else if (whatToDo.equals("secret")) {
                        System.out.println("type 2 numbers you want to add to the secret calculation");
                        int firstNumber = input.nextInt();
                        int secondNumber = input.nextInt();
                        System.out.println(mainUdregner.secret(firstNumber, secondNumber));
                        System.out.println("What would you like to do now: +, -, /, *, secret or stop?");
                        whatToDo = input.next();
                  }
                  else if (whatToDo.equals("stop")) {
                        break;
                  }
                  else {
                        System.out.println("Incorrect option, please try again");
                        System.out.println("What would you like to do +, -, /, *, secret or stop?");
                        whatToDo = input.next();
                  }
            }
      }
}
