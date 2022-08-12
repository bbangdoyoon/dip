package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {
    @Autowired
    private MemberDAO memberDAO;
    @Autowired
    private MemberPrinter memberPrinter;
//
//    public void setMemberPrinter(MemberPrinter memberPrinter) {
//        this.memberPrinter = memberPrinter;
//    }
//
//    public MemberService(){}
//
//    public MemberService(MemberDAO memberDAO){
//        this.memberDAO = memberDAO;
//    }
//
//    public void setMemberDAO(MemberDAO memberDAO){
//        this.memberDAO = memberDAO;
//    }
//    public void list(){
//        memberDAO.selectAll();
//    }
//
//
//    //만약에... datamap 안에 같은 이메일이 있으면 저장할 수 없다
//    //아니면... data를 저장을 해야한다.
    public void regist(MemberDTO dto) throws Exception {

        String result = memberDAO.getSelectByEmail(dto.getEmail());
        if (result.equals("have"))
            throw new Exception();
        else
        memberDAO.insert(dto);
    }

    public void list() {
    }
}
