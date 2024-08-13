package main.java.gpt;

import java.util.Scanner;

public class LoginService {
    public void firstLogin() {
    if (LoginRepository.users[0] == null) {
        System.out.println("No users have logged in yet.");
    } else {
        System.out.println("User " + LoginRepository.users[0].getId() + " has logged in.");
    }
}

    public void loginService() {
        Scanner in = new Scanner(System.in);
        UserDTO[] newUsers = new UserDTO[1];

        for (int i = 0; i < newUsers.length; i++) {
            System.out.println("ID input: ");
            String id = in.nextLine();
            System.out.println("Name input: ");
            String name = in.nextLine();
            System.out.println("Password input: ");
            String pwd = in.nextLine();
            System.out.println("Password confirmation input: ");
            String pwdagree = in.nextLine();
            newUsers[i] = new UserDTO(id, name, pwd, pwdagree);
        }

        LoginRepository.signUp(newUsers);
    }
}
