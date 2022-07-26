package org.example.member;

public class MemberDTO {

    private String email;
    private String name;
    private String pwd;

    MemberDTO(){};

    public MemberDTO(String email, String name, String pwd) {
        this.email = email;
        this.name = name;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
