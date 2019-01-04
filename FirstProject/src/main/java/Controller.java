import java.util.Scanner;

public class Controller {
    private Display display;
    private Operations operations;

    public Controller() {
        display = new Display();
        operations = new Operations();
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    private String checkOperationInput(String operationChoice){
        String correctedOperationChoice = null;
        if(!(operationChoice.equals("A") || operationChoice.equals("S") || operationChoice.equals("M") || operationChoice.equals("D"))) {
            System.out.println("Error: Please enter valid input ('A', 'S', 'M', or 'D')");
            correctedOperationChoice = getUserInput();
            System.out.println(correctedOperationChoice);
            checkOperationInput(correctedOperationChoice);
        }
        return correctedOperationChoice;
    }

    private void translateInputToOperations(String userInput) {
        switch(userInput) {
            case "A":
                break;
            case "S":
                break;
            case "M":
                break;
            case "D":
                break;
            default:
        }
    }

    public void run(){
        System.out.println(display.welcome);
        System.out.println(display.chooseOperation);
        String operationChoice = getUserInput();
        System.out.println(operationChoice);
        String finalChoice = checkOperationInput(operationChoice);

    }

}
