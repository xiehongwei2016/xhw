package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "л����");
		map.put("2", "л����");
		map.put("3", "л����");
		for(String str: map.keySet()){
			System.out.println(str+map.get(str));
		}
	}
	
}
