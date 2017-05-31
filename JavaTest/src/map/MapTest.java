package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "Ğ»ºìÎÀ");
		map.put("2", "Ğ»ºìÑó");
		map.put("3", "Ğ»ºìÑŞ");
		for(String str: map.keySet()){
			System.out.println(str+map.get(str));
		}
	}
	
}
