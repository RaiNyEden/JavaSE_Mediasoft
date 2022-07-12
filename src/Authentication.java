import java.util.Scanner;

public class Authentication {
    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "adminpass";

    public void authenticate(){
        Scanner s = new Scanner(System.in);

        boolean isAuthenticationSuccess = false;
        String login;
        String password;
        for (int i = 3; i != 0 && !isAuthenticationSuccess; i--){

            System.out.print("Login: ");
            login = s.nextLine();

            System.out.print("Password: ");
            password = s.nextLine();

            if (validate(login, password)){
                System.out.print("Login success\n");
                isAuthenticationSuccess = true;
            } else {
                System.out.print("Login or Password is incorrect, please try again. "+ (i - 1) + " times left.\n");
            }
        }
        if (!isAuthenticationSuccess){
            throw new RuntimeException("Login failed");
        }
    }

    public boolean validate(String login, String password){
        if (login.equals(ADMIN_LOGIN) && password.equals(ADMIN_PASSWORD)){
            return true;
        } else return false;
    }

}
