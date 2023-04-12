import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class BusinessLogic {

    public Integer choseNumberToGet() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                Integer chosenNumber = scanner.nextInt();
                return chosenNumber;
            } catch (InputMismatchException e) {
                UserComunication.errorMessage();
            }
        }while (true);
    }
    public Integer getRandomNumber(Integer chosenNumber) {

        Random random = new Random();
        Integer randomNumber = random.nextInt(chosenNumber);
        return randomNumber;
    }
}
