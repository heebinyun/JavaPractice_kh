package map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import map.model.vo.Member;

public class MemberController {
	
	private Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}else {
			map.put(id, m);
			return true;
		}
	}
	
	public String login(String id, String password) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			String savedPwd = m.getPassword();
			
			if(savedPwd.equals(password)) {
				return m.getName();
			}else{
				return null;
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			String savedPwd = m.getPassword();
			
			if(savedPwd.equals(oldPw)) {
				m.setPassword(newPw);
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = map.get(id);
		m.setName(newName);
	}
	
	public Map<String, String> sameName(String name){
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		// HashMap 객체에 해당 id와 이름 저장 후 객체 반환
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것
		HashMap<String, String> same = new HashMap<String, String>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			Member m = map.get(key);
			if(m.getName().equals(name)) {
				same.put(key, name);
			}
		}
		return same;
	}
}
