package main.java.understand.dit;

public class MemberDTO {
    private String id;
    private String pwd;

    public MemberDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }
    public String getId() {
        return id;
    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
