package basicSamples;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> languages=new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "python");
		languages.put(3, "JavaScript");
		System.out.println("hashmap:"+languages);
		
		String value=languages.get(1);
		System.out.println("value at index 1:"+value);
		
		System.out.println("keys:"+languages.keySet());
		
		System.out.println("values:"+languages.values());
		
		System.out.println("keys/value mappings:"+languages.entrySet());
		
		String valueRem=languages.remove(2);
		System.out.println("removed value:"+valueRem);

	}

}
