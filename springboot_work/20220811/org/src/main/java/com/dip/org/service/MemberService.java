package com.dip.org.service;

import com.dip.org.entity.member;
import com.dip.org.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;
    public void regist(member member) {
        member.setStartdate(LocalDateTime.now());
        memberRepository.save(member);
    }
}
