package com.codeit.map.controller;

import com.codeit.map.model.Member;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {
	private final Map<String, Member> map = new HashMap<>();
	
	public MemberController() {
		map.put("test1", new Member("1234", "홍길동"));
		map.put("test2", new Member("1234", "둘리"));
		map.put("test3", new Member("1234", "도우너"));
		map.put("test4", new Member("1234", "또치"));
		map.put("test5", new Member("1234", "홍길동"));
	}

	public boolean joinMembership(String id, Member m) {
		// 가입한 회원인지 검증
		if(map.containsKey(id)) {
			return false;
		}
		map.put(id, m);
		m.setId(id);
		return true;
	}

	public String login(String id, String password) {
		Member member = map.get(id);

		if (member == null) {
			return null; // ID가 존재하지 않음
		}

		if (!member.getPassword().equals(password)) {
			return null; // 비밀번호 틀림
		}

		return member.getName(); // 로그인 성공
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		Member member = map.get(id);

		if (member == null) {
			return false; // 존재하지 않는 회원
		}

		if(member.getPassword().equals(oldPw)) {
			member.setPassword(newPw);
			return true;
		}
		else{
			return false;
		}

	}

	public boolean changeName(String id, String newName) {
		Member member = map.get(id);

		if (member == null) return false;

		member.setName(newName);
		return true;
	}

	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> result = new TreeMap<>();

		for (Map.Entry<String, Member> entry : map.entrySet()) {
			Member member = entry.getValue();
			if (member.getName().equals(name)) {
				result.put(entry.getKey(), member);
			}
		}

		return result;
	}
}















