package org.example;

public class MemberService {

    private MemberDAO memberDAO;

    public MemberService(){}

    public MemberService(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    public void setMemberDAO(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }
    public void list(){
        memberDAO.selectAll();
    }



}
