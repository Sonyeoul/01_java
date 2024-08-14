package main.java.gpt;

public class App {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        loginService.firstLogin();

        loginService.loginService();

        System.out.println("Registered Users:");
        for (UserDTO user : LoginRepository.users) {
            if (user != null) {
                System.out.println(user);
            }
        }
        loginService.firstLogin();
    }
}
