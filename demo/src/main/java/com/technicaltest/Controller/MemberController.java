package com.technicaltest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technicaltest.Entity.Member;
import com.technicaltest.Service.MemberService;

@RestController
@RequestMapping("/api/member")
public class MemberController {
	
	private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/add-member")
    public List<Member> addMembers(@RequestBody List<Member> members) {
        return memberService.saveAllMembers(members);
    }

    @GetMapping("/get-member")
    public List<Member> getMembers() {
        return memberService.getAllMembers();
    }
}
