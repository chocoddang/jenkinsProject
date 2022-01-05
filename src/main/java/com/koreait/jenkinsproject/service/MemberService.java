package com.koreait.jenkinsproject.service;

import java.util.Map;

import com.koreait.jenkinsproject.domain.Member;



public interface MemberService {
	public Map<String, Object> findAllMember(Integer page);  // memberManage.jsp 스크립트 보고 확인, 페이지로드!!
	public Map<String, Object> findMember(Long memberNo);
	public Map<String, Object> addMember(Member member);
	public Map<String, Object> modifyMember(Member member);
	public Map<String, Object> removeMember(Long memberNo);
	
}
