package v1.ch3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		// 第一种
		System.out.println(System.currentTimeMillis());
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println(System.currentTimeMillis());
		// 第二种
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		System.out.println(System.currentTimeMillis());
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
		System.out.println(System.currentTimeMillis());
		// 第三种 推荐
		System.out.println(System.currentTimeMillis());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		System.out.println(System.currentTimeMillis());
		// 第四种
		System.out.println(System.currentTimeMillis());
		for (String v : map.values()) {
			System.out.println(v);
		}
		System.out.println(System.currentTimeMillis());
	}
}
