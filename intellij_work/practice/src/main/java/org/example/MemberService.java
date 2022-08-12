package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberService {

    @Qualifier("memberdao1")
    @Autowired(required = false)
    private MemberDao memberDao;

    public void regist() {
        memberDao.insert();
    }

    public void getall() {
        memberDao.selectaoll();
    }
}
