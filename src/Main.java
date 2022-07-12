import Command.CommandReader;

public class Main {
     public static void main(String[] args) {
        System.out.println("Ветклиника");

        authenticate();
        CommandReader.startReading();
    }

    private static void authenticate(){
        Authentication authentication = new Authentication();
        authentication.authenticate();
    }
}
