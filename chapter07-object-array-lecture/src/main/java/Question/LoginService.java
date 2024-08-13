package main.java.Question;

import java.util.Scanner;

public class LoginService {

    public void firstlogin(){
        UserDTO [] uses = new UserDTO[10];
        if(uses[0]==null){
            System.out.println("not login");
        }
    }



    public void loginService() {

        UserDTO [] uses = new UserDTO[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.println("id input : ");
            String id = in.nextLine();
            System.out.println("name input : ");
            String name = in.nextLine();
            System.out.println("password input : ");
            String pwd = in.nextLine();
            System.out.println("password agree input : ");
            String pwdagree = in.nextLine();
            uses[i] = new UserDTO(id, name, pwd, pwdagree);
        }

    }
}
