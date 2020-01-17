package co.arum.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComapreTest {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Hong", 20));
		list.add(new Emp("Kim", 24));
		list.add(new Emp("Pack", 10));
		list.add(new Emp("Lee", 5));
		list.add(new Emp("Han", 70));
		
		System.out.println(list);
		
		Collections.sort(list, (Emp o1, Emp o2) -> {
				return o1.name.compareTo(o2.name);
		}	);
//		Collections.sort(list, (Emp o1, Emp o2) -> o1.name.compareTo(o2.name));
		System.out.println(list);

		Map<String, Emp> map = new HashMap<>();
		map.put("100", new Emp("hong", 42));
		// 위 아래 같은 뜻
		Map<String, Emp> map2 = Collections.singletonMap("100", new Emp("hong", 42));
		
		
	}
}