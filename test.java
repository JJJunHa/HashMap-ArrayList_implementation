package HashMap;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map3<String, String> test = new HashMap3<>();
		
		
		
		
		map.get(test);
		
		
		test.put("테스트","테스트");
		System.out.println(test.get("테스트"));
		test.put("테스트2","테스트");
		test.put("테스트","테스트1");
		
		System.out.println(test.remove("테스트"));
		map.put("key1", "value1");
		map.put("key2", "value2");

		String value1 = map.get(test); // 컴파일 에러 발생
		 map.get(test);
		
		System.out.println(test.put("테스트2","테스트2"));
		System.out.println(test.toString());
		
	}

}
