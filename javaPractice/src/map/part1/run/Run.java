package map.part1.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import map.part1.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		// Key는 String, value는 Snack으로 타입을 제한한 HashMap 객체 생성
		Map<String, Snack> map = new HashMap<String, Snack>();
		
		// 1. put(K Key, V Value) --> Map에 데이터를 추가하는 메소드
		map.put("오리온", new Snack("다이제", 2500, 1105));
		map.put("해태", new Snack("맛동산", 1500, 420));
		map.put("농심", new Snack("바나나킥", 1500, 315));
		
		System.out.println(map);
		
		// 중복되는 키값의 데이터 추가
		map.put("오리온", new Snack("초코파이", 4000, 2052));
		
		System.out.println(map);
		// 키값이 중복되면 마지막에 추가된 value로 덮어 씌움
		
		
		// 2. get(Object key)
		// --> Map에서 해당하는 key값의 value를 얻어오는 메소드
		System.out.println(map.get("농심"));
		
		
		// 3. size()
		// --> Map에 저장되어 있는 key의 개수를 반환
		System.out.println("Map에 저장된 데이터의 개수 : " + map.size());
		
		
		// 4. replace(K Key, V Value)
		// --> Map에 저장된 데이터 중 Key 값이 같은 Entry의 value를 수정
		// * Entry? key = value 한 쌍을 일컫는 말
		map.replace("오리온", new Snack("다이제", 2500, 1105));
		
		// put() 같은 경우에는 key값이 중복되지 않으면 데이터가 추가되지만
		// replace()는 key값이 중복되지 않으면 데이터를 추가하지 않고 null 값을 반환한다.
		// 오타났을때 사용
		
		
		// 5. remove(K Key)
		// --> 해당 key를 가지고 있는 Entry를 삭제
		map.remove("해태");
		System.out.println(map);
		
		
		
		
		// Map에 저장된 데이터를 하나씩 반복 접근하기
		// Iterator 반복자 사용
		// 1. keySet() 활용
		// --> Map에 저장된 데이터 중 key값들만 Set으로 추출
		Set<String> keySet = map.keySet();
		
		// keySet이 참조하고 있는 Set의 값들을 Iterator를 이용하여 반복자에 담는 과정
		Iterator<String> it = keySet.iterator();
		
		// 반복문을 이용하여 key와 value 출력하기
		while(it.hasNext()) {
			// 반복자를 이용하여 key 값을 알 수 있음
			String key = it.next(); // it.next()를 key와 value에 쓸 경우 두 번 넘어가기 때문에 담아줌
			
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
		
		System.out.println();
		
		
		// 2. keySet() + 향상된 for문
		for(String k : keySet) {
			System.out.println("key : " + k);
			System.out.println("value : " + map.get(k));
		}
		
		System.out.println();
		
		
		// 3. entrySet() 활용
		
		// entrySet() 추출
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		// Iterator 반복 접근
		Iterator<Entry<String, Snack>> it2 = entrySet.iterator(); // Set과 동일한 타입제한
		
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next(); // it2.next(); : Entry<String, Snack> 타입
			
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
	}
}
