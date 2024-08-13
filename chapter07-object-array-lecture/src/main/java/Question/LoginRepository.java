package main.java.Question;

public class LoginRepository {

    public final static UserDTO [] uses = new UserDTO[10];


    public static boolean signUp(UserDTO [] newuse) {
        LoginService loginS = new LoginService();

        for (int i = 0; i < 1; i++) {
            if (newuse[i].getPwd().equals(newuse[i].getPwdagree())) {
                System.out.println("compleate");
                return true;
            }else{
                System.out.println("not clear");
            }
        }
        return false;
    }

}
