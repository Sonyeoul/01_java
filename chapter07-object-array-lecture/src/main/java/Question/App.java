package main.java.Question;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LoginService loginService = new LoginService();
        LoginRepository loginRepository = new LoginRepository();


        loginService.firstlogin();
        loginService.loginService();

        System.out.println("Users:");
        for (UserDTO user : LoginRepository.uses) {
            if (user != null) {
                System.out.println(user);
            }
        }
        loginService.firstlogin();

    }
}
