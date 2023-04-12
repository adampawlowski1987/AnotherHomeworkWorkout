public class UserComunication {
    public static void userMessage1() {
        System.out.println("Wpisz ile liczb mam wylosować");
    }

    public static void userMessage2() {
        System.out.println("Wpisz końcową liczbe zakresu, z jakiego mają być losowane liczby");
    }
public static void errorMessage(){
    System.out.println("Podałeś nieprawidłową liczbę, podaj liczbę ponowie");
}
    public static void messageThatGiveAnswer (Integer randomNumber){
        System.out.println(randomNumber);
    }
}