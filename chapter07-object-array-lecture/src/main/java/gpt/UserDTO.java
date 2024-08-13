package main.java.gpt;

public class UserDTO {
    private String id;
    private String name;
    private String pwd;
    private String pwdagree;

    public UserDTO() {
    }

    public UserDTO(String id, String name, String pwd, String pwdagree) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.pwdagree = pwdagree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdagree() {
        return pwdagree;
    }

    public void setPwdagree(String pwdagree) {
        this.pwdagree = pwdagree;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", pwdagree='" + pwdagree + '\'' +
                '}';
    }
}
