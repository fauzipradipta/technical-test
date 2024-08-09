package com.technicaltest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technicaltest.Entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
