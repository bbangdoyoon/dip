package org.example;

public class MemberPrinter {

    private String ver = "1.0";

    public MemberPrinter(String ver) {
        this.ver = ver;
    }

    @Override
    public String toString() {
        return "MemberPrinter{" +
                "ver='" + ver + '\'' +
                '}';
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }
}
