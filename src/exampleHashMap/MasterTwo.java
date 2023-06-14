package exampleHashMap;

import java.util.ArrayList;
import java.util.List;

public class MasterTwo {

	public static void main(String[] args) {
		
		String input = "key: Matheus, value: 25; key: Henrique, value: 29; key: Glória, value: 21;";
		String[] pairs = input.split(";");
		
		List<String> peopleLow29 = new ArrayList<>();
		
		for (String pair : pairs) {
			
			pair = pair.trim();
			
			String[] keyValuePar = pair.split(", ");
			String key = keyValuePar[0].split(": ")[1];
			int value = Integer.parseInt(keyValuePar[1].split(": ")[1]);
			
			if(value < 29) {
				peopleLow29.add(key);
			}
		}
		
		int quantity = peopleLow29.size();
		
		System.out.print(quantity + " Pessoa(as): ");
		System.out.print(peopleLow29);

	}

}
