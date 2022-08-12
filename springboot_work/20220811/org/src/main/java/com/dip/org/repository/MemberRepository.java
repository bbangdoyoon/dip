package com.dip.org.repository;

import com.dip.org.entity.member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<member, Long> {
}
