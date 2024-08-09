package com.technicaltest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.technicaltest.Entity.Member;
import com.technicaltest.Repository.MemberRepository;

public class MemberService {
	
	private final MemberRepository memberRepository;
	
	 @Autowired
     public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
     }
	 
	 public List<Member> saveAllMembers(List<Member> members) {
	    return memberRepository.saveAll(members);
	 }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
	
	
}
