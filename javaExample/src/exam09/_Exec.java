package exam09;

import java.util.HashMap;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		// HashMap - key, value
		HashMap<String,String> map = new HashMap<>();
		System.out.println("map : "+map);    // {}
		map.put("name", "마동석");
		System.out.println("map : "+map);    //{name=마동석}
		map.put("kor",90+"");
		System.out.println("map : "+map);  
		map.put("eng",80+"");
		System.out.println("map : "+map);    		
		map.put("name","주지훈");
		System.out.println("map : "+map.get("name"));
		System.out.println("=================================");
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.err.println(key+" : "+map.get(key));
		}
		map.remove("kor");
		
//		Map<Integer,String> map2=new HashMap();
//        map2.put(1, "홍길동");
//        System.out.println("map2 : "+map2); 
//        map2.put(2, "이성순");
//        System.out.println("map2 : "+map2); 
        
        
	}

}
