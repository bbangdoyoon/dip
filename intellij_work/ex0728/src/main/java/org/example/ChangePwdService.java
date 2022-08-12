package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class ChangePwdService {

    @Autowired
    private MemberDAO memberDAO;

    public void chpwd(){
        memberDAO.update();
    }
}
