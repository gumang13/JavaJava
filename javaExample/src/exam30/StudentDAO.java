package exam30;

import java.util.HashMap;
import java.util.Map;

public class StudentDAO {
         
	public int setInsert( Map<String,String> map) {
		System.out.println("-- set Insert() --");
		System.out.println("name : "+map.get("name"));
		System.out.println("ssn : "+map.get("ssn"));
		System.out.println("phone : "+map.get("phone"));
		System.out.println("address :"+map.get("address"));
		
		return 0;
	}
}
