package main.java.gpt;

public class LoginRepository {

    public final static UserDTO[] users = new UserDTO[10];

    public static boolean signUp(UserDTO[] newUsers) {
        for (UserDTO newUser : newUsers) {
            if (!newUser.getPwd().equals(newUser.getPwdagree())) {
                System.out.println("Passwords do not match for user: " + newUser.getId());
                return false;
            }

            for (UserDTO existingUser : users) {
                if (existingUser != null && existingUser.getId().equals(newUser.getId())) {
                    System.out.println("User already exists with the same ID: " + newUser.getId());
                    return false;
                }
            }

            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = newUser;
                    System.out.println("Sign up complete for user: " + newUser.getId());
                    break;
                }
            }
        }
        return true;
    }
}

