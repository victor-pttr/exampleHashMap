package exampleHashMap;

import java.util.HashMap;
import java.util.Map;

public class Master {

	public static void main(String[] args) {
		
		HashMap<String, Integer> people = new HashMap<>();
		people.put("Mathues", 25);
		people.put("Henrique", 29);
		people.put("Gloria", 21);
		
		/* 
		 * people.put("Potter", 35); people.put("Rodrigo", 24); people.put("Yuri", 10);
		 */
		
		int count = 0;
		int fullList = people.size();
		
		System.out.println("");
		System.out.println(people);
		System.out.println("------------------------");
		System.out.println( "Total de Pessoas na lista.: " + fullList );
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("Abaxio temos a lista de pessoas com menos de 29 anos de idade.");
		System.out.println("");
		
		
//		Itera a lsta de pessoas e retorna as pessoas que tem menos de 29 anos de idade
		for(Map.Entry<String, Integer> listPeople : people.entrySet()) {
			String key = listPeople.getKey();
			Integer value = listPeople.getValue();
			
			if(value < 29) {
				String result = String.format("Key.: %s | Value.: %s", key, value);
				System.out.println(result);
			}
			
		}
		
//		Itera os "values" da lista de pessoas e retornar a quantidade de pessoas com menos
//		de 29 anos de idade.
		for (Integer idade : people.values()) {
            if (idade < 29) {
                count++;
            }
        }
		
		System.out.println("");
		System.out.println("Quantidade de pessoas com menos de 29 anos de idade.: " + count);
		
	}

}
