package HashMap;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map3<String, String> test = new HashMap3<>();
		
		
		
		
		map.get(test);
		
		
		test.put("�׽�Ʈ","�׽�Ʈ");
		System.out.println(test.get("�׽�Ʈ"));
		test.put("�׽�Ʈ2","�׽�Ʈ");
		test.put("�׽�Ʈ","�׽�Ʈ1");
		
		System.out.println(test.remove("�׽�Ʈ"));
		map.put("key1", "value1");
		map.put("key2", "value2");

		String value1 = map.get(test); // ������ ���� �߻�
		 map.get(test);
		
		System.out.println(test.put("�׽�Ʈ2","�׽�Ʈ2"));
		System.out.println(test.toString());
		
	}

}
