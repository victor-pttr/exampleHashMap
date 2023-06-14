package exampleHashMap;

import java.util.HashMap;
import java.util.Map;

public class Master {

	public static void main(String[] args) {
		
		HashMap<String, Integer> people = new HashMap<>();
		people.put("Mathues", 25);
		people.put("Henrique", 29);
		people.put("Gloria", 21);
		
		int count = 0;
		
		for (Integer idade : people.values()) {
            if (idade < 29) {
                count++;
            }
        }
		
		System.out.println("");
		System.out.print(count + " Pessoa(s): ");
		
		for(Map.Entry<String, Integer> listPeople : people.entrySet()) {
			String key = listPeople.getKey();
			Integer value = listPeople.getValue();
			
			if(value < 29) {
				String result = String.format(key + " ");
				System.out.print(result);
			}
		}
	}
}

