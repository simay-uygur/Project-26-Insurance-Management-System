import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mail address!");
        String mailInput = input.nextLine();
        System.out.println("Now please enter your password:  ");
        String passwordInput = input.nextLine(); //bakalım
        AccountManager accountManager = new AccountManager();
        Account account;

        try {
            account = accountManager.logIn(mailInput, passwordInput);
        } catch (InvalidAuthenticationException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Login status : " + accountManager.getLoginStatusUser());
        }
       
    }
}
