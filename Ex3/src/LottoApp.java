public class LottoApp {

    public static void main(String[] args) {

        Integer numbersToGet;
        Integer numbersRange;
        Integer drawnNumber;
        BusinessLogic businessLogic = new BusinessLogic();

        UserComunication.userMessage1();
        numbersToGet = businessLogic.choseNumberToGet();
        UserComunication.userMessage2();
        numbersRange = businessLogic.choseNumberToGet();
        drawnNumber = businessLogic.getRandomNumber(numbersToGet);
        UserComunication.messageThatGiveAnswer(drawnNumber);

    }


}
